package com.yidaoyun.user.config.sms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author create by onlyeatonebowl@1daoyun.co
 * @version 1.0
 * @since 2020/1/6 18:19
 */
@Component
public class SmsService {

    @Value("${sms.account}")
    private String account;
    @Value("${sms.token}")
    private String token;
    @Value("${sms.appid}")
    private String appid;
    @Value("${sms.registerTemplateId}")
    private String registerTemplateId;
    @Value("${sms.changePasswordTemplateId}")
    private String changePasswordTemplateId;
    @Value("${sms.intervals}")
    private String intervals;


    /**
     * 初始化restApi
     * @return CCPRestSDK
     */
    public CCPRestSDK initialSDK() {
        //初始化SDK
        CCPRestSDK restApi = new CCPRestSDK();
        //******************************注释*********************************************
        //*初始化服务器地址和端口                                                       *
        //*沙盒环境（用于应用开发调试）：restAPI.init("sandboxapp.cloopen.com", "8883");*
        //*生产环境（用户应用上线使用）：restAPI.init("app.cloopen.com", "8883");       *
        //*******************************************************************************
        restApi.init("app.cloopen.com", "8883");
        //******************************注释*********************************************
        //*初始化主帐号和主帐号令牌,对应官网开发者主账号下的ACCOUNT SID和AUTH TOKEN     *
        //*ACOUNT SID和AUTH TOKEN在登陆官网后，在“应用-管理控制台”中查看开发者主账号获取*
        //*参数顺序：第一个参数是ACOUNT SID，第二个参数是AUTH TOKEN。                   *
        //*******************************************************************************
        restApi.setAccount(account, token);
        //******************************注释*********************************************
        //*初始化应用ID                                                                 *
        //*测试开发可使用“测试Demo”的APP ID，正式上线需要使用自己创建的应用的App ID     *
        //*应用ID的获取：登陆官网，在“应用-应用列表”，点击应用名称，看应用详情获取APP ID*
        //*******************************************************************************
        restApi.setAppId(appid);
        return restApi;
    }


    //******************************注释****************************************************************
    //*调用发送模板短信的接口发送短信                                                                  *
    //*参数顺序说明：                                                                                  *
    //*第一个参数:是要发送的手机号码，可以用逗号分隔，一次最多支持100个手机号                          *
    //*第二个参数:是模板ID，在平台上创建的短信模板的ID值；测试的时候可以使用系统的默认模板，id为1。    *
    //*系统默认模板的内容为“【云通讯】您使用的是云通讯短信模板，您的验证码是{1}，请于{2}分钟内正确输入”*
    //*第三个参数是要替换的内容数组。																														       *
    //**************************************************************************************************

    //**************************************举例说明***********************************************************************
    //*假设您用测试Demo的APP ID，则需使用默认模板ID 1，发送手机号是13800000000，传入参数为6532和5，则调用方式为           *
    //*result = restAPI.sendTemplateSMS("13800000000","1" ,new String[]{"6532","5"});																		  *
    //*则13800000000手机号收到的短信内容是：【云通讯】您使用的是云通讯短信模板，您的验证码是6532，请于5分钟内正确输入     *
    //*********************************************************************************************************************
    /**
     * 发送注册短信
     * @param phone 电话号码
     * @param code 验证码
     * @return Boolean
     */
    public boolean sendRegisterSms(String phone, String code) {
        CCPRestSDK restApi = initialSDK();
        HashMap<String, Object> stringObjectHashMap = restApi.sendTemplateSMS(phone, registerTemplateId, new String[]{code, intervals});
        if ("000000".equals(stringObjectHashMap.get("statusCode"))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 发送修改密码短信
     * @param phone 电话号码
     * @param code 验证码
     * @return Boolean
     */
    public boolean sendChangePasswordSms(String phone, String code) {
        CCPRestSDK restApi = initialSDK();
        HashMap<String, Object> stringObjectHashMap = restApi.sendTemplateSMS(phone, changePasswordTemplateId, new String[]{code});
        if ("000000".equals(stringObjectHashMap.get("statusCode"))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取短信账户信息
     * @return map
     */
    public Map<String, Object> queryAccountInfo() {
        CCPRestSDK restApi = initialSDK();
        return restApi.queryAccountInfo();
    }

//    /**
//     * demo
//     * @param args
//     */
//    public static void main(String[] args) {
//        HashMap<String, Object> result = null;
//
//        CCPRestSDK restAPI = new CCPRestSDK();
//        restAPI.init("app.cloopen.com", "8883");// 初始化服务器地址和端口，格式如下，服务器地址不需要写https://
//        restAPI.setAccount("AccountSid", "AccountToken");// 初始化主帐号和主帐号TOKEN
//        restAPI.setAppId("AppId");// 初始化应用ID
//        result = restAPI.sendTemplateSMS("手机号码","模板id" ,new String[]{});
//
//        System.out.println("SDKTestSendTemplateSMS result=" + result);
//
//        if("000000".equals(result.get("statusCode"))){
//            //正常返回输出data包体信息（map）
//            HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
//            Set<String> keySet = data.keySet();
//            for(String key:keySet){
//                Object object = data.get(key);
//                System.out.println(key +" = "+object);
//            }
//        }else{
//            //异常返回输出错误码和错误信息
//            System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
//        }
//    }

}
