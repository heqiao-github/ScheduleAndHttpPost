package com.example.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @author ljl
 * @version V1.0
 * @Title: JSONResult.java
 * @Description: 自定义响应数据结构
 * 这个类是提供给门户，ios，安卓用的
 * 门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 其他自行处理
 * 200：表示成功
 * 500：表示错误，错误信息在msg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 555：异常抛出信息
 * Copyright: Copyright (c) 2016
 * Company:Nathan.Lee.Salvatore
 * @date 2016年4月22日 下午8:33:36
 */
public class JSONResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;


    public static JSONResult build(Integer status, String msg, Object data) {
        return new JSONResult(status, msg, data);
    }

    public static JSONResult ok(Object data) {
        return new JSONResult(data);
    }

    public static JSONResult ok(Object data, String msg) {
        return new JSONResult(NumberConst.INTEGER_STATIC.INTEGER_200.getVal(), msg, data);
    }

    public static JSONResult ok() {
        return new JSONResult(null);
    }

    public static JSONResult errorMsg(String msg) {
        return new JSONResult(NumberConst.INTEGER_STATIC.INTEGER_500.getVal(), msg, null);
    }

    public static JSONResult errorMsg(String msg, Object data) {
        return new JSONResult(NumberConst.INTEGER_STATIC.INTEGER_500.getVal(), msg, data);
    }

    public static JSONResult errorMsg(int errorCode, String msg) {
        return new JSONResult(errorCode, msg, null);
    }

    public static JSONResult errorMap(Object data) {
        return new JSONResult(NumberConst.INTEGER_STATIC.INTEGER_501.getVal(), "error", data);
    }

    public static JSONResult errorException(String msg) {
        return new JSONResult(NumberConst.INTEGER_STATIC.INTEGER_555.getVal(), msg, null);
    }

    public JSONResult() {

    }

    public JSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONResult(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public JSONResult(Object data) {
        this.status = NumberConst.INTEGER_STATIC.INTEGER_200.getVal();
        this.msg = "OK";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @param jsonData
     * @param clazz
     * @return
     * @Description: 将json结果集转化为JSONResult对象
     * 需要转换的对象是一个类
     * @author leechenxiang
     * @date 2016年4月22日 下午8:34:58
     */
    public static JSONResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, JSONResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param json
     * @return
     * @Description: 没有object对象的转化
     * @author leechenxiang
     * @date 2016年4月22日 下午8:35:21
     */
    public static JSONResult format(String json) {
        try {
            return MAPPER.readValue(json, JSONResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param jsonData
     * @param clazz
     * @return
     * @Description: Object是集合转化
     * 需要转换的对象是一个list
     * @author leechenxiang
     * @date 2016年4月22日 下午8:35:31
     */
    public static JSONResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

}