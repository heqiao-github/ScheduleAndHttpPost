package com.example.common;


/**
 * 系统常量
 *
 * @author
 */
public class Constants {
    /**
     * 查询条件 格式时间到时分秒
     */
    public static final String FORMAT_HMS = " 00:00:00";
    /**
     * 查询条件 格式时间到时分秒
     */
    public static final String FORMAT_HMS_END = " 23:59:59";

    /**
     * 年 格式化
     */
    public static final String YEAR_MONTH = "yyyy-MM";
    /**
     * 日期 格式化
     */
    public static final String DATE = "yyyy-MM-dd";
    /**
     * 日期时间 格式化
     */
    public static final String TIMESTAMP = "yyyy-MM-dd HH:mm:ss";
    /**
     * 日期时间 格式化
     */
    public static final String TIMESTAMPNOW = "yyyyMMddHHmmss";
    /**
     * 日期时间 格式化
     */
    public static final String DATENOG = "yyyyMMdd";
    /**
     * 日期时间 格式化
     */
    public static final String TIMESTAMP_MS = "yyyy-MM-dd HH:mm:ss.SSS";
    /**
     * 时间 格式化
     */
    public static final String TIME = "HH:mm:ss";

    /**
     * 徐汇身份证号码前六位
     */
    public static final String XUHUI_CODE = "310104";

    /**
     * 徐汇分局机构编码
     */
    public static final String XUHUI_ORG_CODE = "310104000000";

    /**
     * 上海市公安局徐汇分局
     */
    public static final String PREFIX1 = "上海市公安局徐汇分局";
    public static final String PREFIX2 = "上海市公安局";
    public static final String PREFIX3 = "上海市徐汇区";
    /**
     * 上海市前缀
     */
    public static final String PREFIX4 = "上海市";

    /**
     * 警员职称
     */
    public static final String JOB = "民警";

    /**
     * 暂无
     */
    public static final String ZAN_WU = "暂无";

    /**
     * 警情未处理
     */
    public static final String ALARM_NO_DISPOSE = "0";
    /**
     * 警情处理中
     */
    public static final String ALARM_DISPOSE = "1";
    /**
     * 警情已完成
     */
    public static final String ALARM_FINISH = "2";

    public static final String REDIS_KEY_READEARTH_PDA = "onlinepolice:pda:";
    public static final String REDIS_KEY_READEARTH_CAR = "readearth:car";
    public static final String REDIS_KEY_READEARTH_HAND = "onlinepolice:hand";
    public static final String REDIS_KEY_READEARTH_APP = "onlinepolice:app";
    public static final String REDIS_KEY_READEARTH_RECORDER = "onlinepolice:recorder";
    //    public static final String REDIS_KEY_ONPOLICE="json:onlinepolice:";
    public static final String REDIS_KEY_ONPOLICE = "onlinepolice:";

    public static final String REDIS_JSON_POLICE_PREFIX = "json:police:";
    public static final String REDIS_JSON_ORG_PREFIX = "json:org:";

    public static final String REDIS_KEY_XUHUI_PCS = "xuhui:pcs";
    public static final String REDIS_KEY_PCS_CODE_PREFIX = "pcs:code:";
    //    public static final String REDIS_KEY_4A_POLICE_PREFIX  = "police:";
//    public static final String REDIS_KEY_4A_POLICE_PREFIX  = "4A-police:code";
    public static final String REDIS_KEY_4A_POLICE_CODE_PREFIX = "4A-police:code";
    public static final String REDIS_KEY_ALARM_IDCARD_PREFIX = "alarm:alarmno:idcard:";
    public static final String REDIS_KEY_IDCARD_ALARM_PREFIX = "alarm:idcard:alarmno:";
    public static final String REDIS_KEY_4A_POLICE_IDCARD_PREFIX = "4A-police:idcard";
    public static final String REDIS_KEY_ONLINE_POLICE_PDA_RADIO = "police:pda:radio";
    public static final String REDIS_KEY_ONLINE_POLICE_CAR = "police:car";

    public static final String REDIS_KEY_POLICE_FEED_BACK_PREFIX = "police:feedback:";

    public static final String REDIS_KEY_ALARM_SYNC_PREFIX = "alarm:sync:";
    /**
     * 视频结构化登录tokenid
     */
    public static final String REDIS_VEDIO_STRUCT_LOGIN_TOKENID = "vedio-struct-tokenId";
    public static final String REDIS_VEDIO_STRUCT_CAMERAID_LIST = "vedio-struct-cameraId-list";
    /**
     * 视频结构化摄像头和任务组id关系
     */
    public static final String REDIS_VEDIO_STRUCT_CAMERAID_GROIUPID = "vedio-struct-cameraId-groupId";
    //视频结构化的相关url
    public final static String VEDIO_STRUCT_ADD_TASK = "http://15.128.16.233:8081/gateway/smartapp/structure/save";
    public final static String VEDIO_STRUCT_GET_TASKLIST = "http://15.128.16.233:8081/gateway/smartapp/structure/query_group";
    public final static String VEDIO_STRUCT_GET_GROUPID = "http://15.128.16.233:8081/gateway/smartapp/structure/get";
    public final static String VEDIO_STRUCT_DELETE_VEDIOTASK = "http://15.128.16.233:8081/gateway/smartapp/structure/delete";
    public final static String VEDIO_STRUCT_DELETE_CAMERA_TASK = "http://15.128.16.233:8081/gateway/smartapp/structure/delete_camera";
    public final static String VEDIO_STRUCT_UPDATE_TASK_STATUS = "http://15.128.16.233:8081/gateway/smartapp/structure/switch_group";
    public final static String VEDIO_STRUCT_UPDATE_CAMERA_STATUS = "http://15.128.16.233:8081/gateway/smartapp/structure/switch_task";
    public final static String VEDIO_STRUCT_QUERY_BY_CAMERA = "http://15.128.16.233:8081/gateway/smartapp/structure/query_structure_info/";
    public final static String VEDIO_STRUCT_MESSAGE_BY_DETAIL = "http://15.128.16.233:8081/gateway/warehouse/vehicle_service/v2/traffic/getTrafficByIds";
    /**
     * -1：停止；0-未开始；1-运行中；2-已过期；3-排队中；4-异常
     */
    public final static String VEDIO_TASKSTATUS_STOP = "-1";
    public final static String VEDIO_TASKSTATUS_UN_START = "0";
    public final static String VEDIO_TASKSTATUS_RUNNING = "1";
    public final static String VEDIO_TASKSTATUS_OVER_TIME = "2";
    public final static String VEDIO_TASKSTATUS_QUEEN = "3";
    public final static String VEDIO_TASKSTATUS_EXCEPTION = "4";

    public final static String WEIXIN_NEIWANG_URL_PREFIX = "https://mperson.gaj.sh.gov.cn";
    public final static String WEIXIN_NEIWANG_URL_PREFIX1 = "https://shgzry.gaj.sh.gov.cn";
    //    https://shgzry.gaj.sh.gov.cn/back/yryd/service/api/mobile/query/previewPhotoStream?mediaId=1Y-N2QPpmG-wX2FDZ_NZjgvJNy2v404fK6DaiSCqg_0VPEOEA0Evu1DmkdOtyKTL2&token=qeV7Eii-pHvXeyPjPprCYXeq1b7Ji0wrJR4oEIPmexg
//    https://mperson.gaj.sh.gov.cn/back/yryd/service/api/mobile/query/previewPhotoStream?mediaId=10tKECR0Opfnn18QO-pzSq2BPk73k24p5d75tx7F34ne5D6vfYGv9YqdZIAOdYqUI&token=alXRKN7ckkJbS7UFbvNMGAtty1DciEEAiP8nsB5Z7ME
//    //http://15.75.14.38:8080
//    http://15.75.18.101:8080/back/yryd/service/api/mobile/query/previewPhotoStream?mediaId=1JOAm8O0xW2ETMD4OoB4MFk2-oo1KH2nkZLQlcpWM3cZJzM5j19MyoWLO1t6MSsGQ&token=qeV7Eii-pHvXeyPjPprCYXeq1b7Ji0wrJR4oEIPmexg
    public final static String WEIXIN_WAIWANG_URL_PREFIX = "http://15.128.16.233:8081";

    public final static String WEIXIN_WAIWANG_URL_PREFIX1 = "http://15.75.18.101:8080";

    public final static String TYPE_PICTURE = "picture";
    public final static String TYPE_RECORD = "record";
    public final static String TYPE_VIDEO = "video";


    public static final Integer SERVER_PORT = 8081;

    /**
     * 人员属性类型
     */
    /**
     * 身份证属性
     */
    public static final String IDNO_TYPE = "111";
    /**
     * 姓名属性
     */
    public static final String RNAME_TYPE = "B010001";
    /**
     * 民族属性
     */
    public static final String NATION_TYPE = "B010012";
    /**
     * 性别属性
     */
    public static final String SEX_TYPE = "B010011";
    /**
     * 出生日期属性
     */
    public static final String BIRTHDAY_TYPE = "B010014";
    /**
     * 籍贯属性
     */
    public static final String JG_TYPE = "B010013";
    /**
     * 手机属性
     */
    public static final String MOBILE_TYPE = "D201005";
    /**
     * 单位属性
     */
    public static final String DW_TYPE = "E010002";
    /**
     * 户籍地属性
     */
    public static final String HHPLACE_TYPE = "X000006";
    /**
     * 现住地属性
     */
    public static final String XZD_TYPE = "B030011";
    /**
     * 标签属性
     */
    public static final String LABEL_TYPE = "B030012";
    /**
     * 列官员因属性
     */
    public static final String LGYY_TYPE = "I020003";
    /**
     * 列管单位属性
     */
    public static final String LGDW_TYPE = "X000036";
    /**
     * 证件号码属性
     */
    public static final String ACCOUNT_IDNO = "111";
    /**
     * 照片属性
     */
    public static final String PHOTO_TYPE = "FH22062";
    /**
     * 人员新增的所有属性 , "FH22062"
     */
    public static final String[] TYPE_ALL_DELETE = {"111", "B010001", "B010012", "B010011", "B010014", "B010013", "D201005", "E010002", "X000006", "B030011", "B030012", "I020003", "FH50010", "X000036"};
    /**
     * 返回msg编码定义
     */
    /**
     * 查询成功
     */
    public static String QUERY_SUCCESS = "1001011000";
    /**
     * 查询失败
     */
    public static String QUERY_ERROR = "1001011001";
    /**
     * 对象已存在
     */
    public static String EXIST_PEOPLE = "1001011002";
    /**
     * 更新成功
     */
    public static String UPDATE_SUCCESS = "1001011003";


    public static String YT_SESSIONID = "";
}
