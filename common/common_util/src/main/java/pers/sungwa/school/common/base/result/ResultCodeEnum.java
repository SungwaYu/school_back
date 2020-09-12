package pers.sungwa.school.common.base.result;

import lombok.Getter;
import lombok.ToString;

/**
 * @author sungwa
 * @date 9/11/20
 */
@Getter
@ToString
public enum ResultCodeEnum {

    SUCCESS(true, 20000,"Success"),
    UNKNOWN_REASON(false, 20001, "Unknown Error"),

    BAD_SQL_GRAMMAR(false, 21001, "sql Statement Error"),
    JSON_PARSE_ERROR(false, 21002, "JSON Parse Error"),
    PARAM_ERROR(false, 21003, "Parameters Error"),

    FILE_UPLOAD_ERROR(false, 21004, "File Upload Error"),
    FILE_DELETE_ERROR(false, 21005, "File Delete Error"),
    EXCEL_DATA_IMPORT_ERROR(false, 21006, "Excel数据导入错误"),

    VIDEO_UPLOAD_ALIYUN_ERROR(false, 22001, "Ailiyun Video Upload Error"),
    VIDEO_UPLOAD_TOMCAT_ERROR(false, 22002, "Video Upload Server Error"),
    VIDEO_DELETE_ALIYUN_ERROR(false, 22003, "Fetch Video Aliyun Error"),
    FETCH_VIDEO_UPLOADAUTH_ERROR(false, 22004, "Fetch Video Upload Authority Error"),
    REFRESH_VIDEO_UPLOADAUTH_ERROR(false, 22005, "Refresh Video Upload Authority Error"),
    FETCH_PLAYAUTH_ERROR(false, 22006, "Fetch Play Authority Error"),

    URL_ENCODE_ERROR(false, 23001, "URL Encode Error"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(false, 23002, "Illegal Callback Request Error"),
    FETCH_ACCESSTOKEN_FAILD(false, 23003, "Fetch AccessToken Failed"),
    FETCH_USERINFO_ERROR(false, 23004, "Fetch User Info Error"),
    LOGIN_ERROR(false, 23005, "Login Error"),

    COMMENT_EMPTY(false, 24006, "Comment Empty"),

    PAY_RUN(false, 25000, "Pay Runtime Error"),
    PAY_UNIFIEDORDER_ERROR(false, 25001, "Pay Unified Order Error"),
    PAY_ORDERQUERY_ERROR(false, 25002, "Order Query Error"),

    ORDER_EXIST_ERROR(false, 25003, "Order Exists"),

    GATEWAY_ERROR(false, 26000, "Gateway Error"),

    CODE_ERROR(false, 28000, "Code Error"),

    LOGIN_PHONE_ERROR(false, 28009, "Login Phone Error"),
    LOGIN_MOBILE_ERROR(false, 28001, "Login Username Error"),
    LOGIN_PASSWORD_ERROR(false, 28008, "Login Password Error"),
    LOGIN_DISABLED_ERROR(false, 28002, "Login User Disabled"),
    REGISTER_MOBLE_ERROR(false, 28003, "Register Phone Exists"),
    LOGIN_AUTH(false, 28004, "Needed to Login"),
    LOGIN_ACL(false, 28005, "Permission Denied"),
    SMS_SEND_ERROR(false, 28006, "SMS Send Error"),
    SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL(false, 28007, "SMS Busy Error");


    private Boolean success;

    private Integer code;

    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
