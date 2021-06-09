package com.example.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import net.sf.json.JSONObject;


import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HttpRequest {

    public static Map<String, String> headMap = new HashMap<String, String>();
    private static HttpClient client = null;

    static {
        client = HttpClients.createDefault();
        headMap.put("Content-Type", "application/json");

    }


    /**
     * get请求，返回值根据实际情况解析
     *
     * @param url
     * @return
     */
    public static String httpGet(String url) {

        HttpGet get = new HttpGet(url);
        try {
            HttpResponse response = client.execute(get);

            HttpEntity entity = response.getEntity();

            String result = EntityUtils.toString(entity, "UTF-8");

            return result;

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;
    }

    /**
     * get请求，返回值根据实际情况解析
     *
     * @param url
     * @return
     */
    public static String httpGet(String headerName,String headerValue, String url) {

        HttpGet get = new HttpGet(url);
        try {
            get.setHeader(headerName,headerValue);
            HttpResponse response = client.execute(get);

            HttpEntity entity = response.getEntity();

            String result = EntityUtils.toString(entity, "UTF-8");

            return result;

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;
    }


    /**
     * post，返回值根据实际情况解析
     *
     * @param url
     * @return
     */
    public static String httpPost(String url,JSONObject params,Map<String, String> headerMap) {

        HttpPost method = new HttpPost(url);
        String resultStr="";
        try {
            if (null != params) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(params.toString(), "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            if(null != headerMap){
                for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                    method.setHeader(entry.getKey(), entry.getValue());
                }
            }
            HttpResponse result = client.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**请求发送成功，并得到响应**/
            if (result.getStatusLine().getStatusCode() == 200) {
                try {
                    /**读取服务器返回过来的json字符串数据**/
                    resultStr = EntityUtils.toString(result.getEntity());
                } catch (Exception e) {
                    log.error("post请求提交失败:" + url + "\n" + e);
                }
            }else  if (result.getStatusLine().getStatusCode() == 401) {
                resultStr = EntityUtils.toString(result.getEntity());
            }
        } catch (IOException e) {
            log.error("post请求提交失败:" + url+"\n"+ e);
        }
        return resultStr;
    }


    /**
     * post，返回值根据实际情况解析
     *
     * @param url
     * @return
     */
    public static String httpPost(String url,String json) {

        HttpPost method = new HttpPost(url);
        String resultStr="";
        try {
            if (null != json) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(json, "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            HttpResponse result = client.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**请求发送成功，并得到响应**/
            if (result.getStatusLine().getStatusCode() == 200) {

                try {
                    /**读取服务器返回过来的json字符串数据**/
                    resultStr = EntityUtils.toString(result.getEntity());
                } catch (Exception e) {
                    System.out.println("post请求提交失败:" + url + "\n" + e);
                }
            }
        } catch (IOException e) {
            System.out.println("post请求提交失败:" + url+"\n"+ e);
        }
        return resultStr;
    }

}
