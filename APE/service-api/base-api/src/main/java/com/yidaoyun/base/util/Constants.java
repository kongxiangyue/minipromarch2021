package com.yidaoyun.base.util;

/**
 * 通用常量信息
 */
public class Constants {
    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * 通用成功标识
     */
    public static final String SUCCESS = "0";

    /**
     * 通用失败标识
     */
    public static final String FAIL = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * 自动去除表前缀
     */
    public static final String AUTO_REOMVE_PRE = "true";

    /**
     * 当前记录起始索引
     */
    public static final String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static final String ORDER_BY_COLUMN = "sortField";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static final String IS_ASC = "sortOrder";

    /**
     * 自定义的排序顺序
     */
    public static final String MY_ORDER = "myOrder";

    public static final String CURRENT_ID = "current_id";

    public static final String CURRENT_USERNAME = "current_username";

    public static final String TOKEN = "token";

    public static final String DEFAULT_CODE_KEY = "random_code_";

    public final static String ACCESS_TOKEN = "access_token_";

    public final static String ACCESS_USERID = "access_userid_";

    public static final String RESOURCE_PREFIX = "/profile";

    /**
     * 短信验证码前缀
     */
    public static final String SMS_PREFIX = "CJLM:SMS";
    /**
     * 短信验证码类型：注册 0 修改密码 1
     */
    public static final int SMS_TYPE_REGISTERED = 0;
    public static final int SMS_TYPE_CHANGE_PASSWORD = 1;

    /**
     * 微信redis缓存前缀
     */
    public static final String WX_PREFIX = "CJLM:WX";
    /**
     * 微信公众号access_token
     */
    public static final String PUBLIC_ACCESS_TOKEN = "PUBLIC_ACCESS_TOKEN";
    /**
     * 微信小程序access_token
     */
    public static final String APPLET_WX_ACCESS = "APPLET_ACCESS_TOKEN";
    /**
     * 微信scene_id
     */
    public static final String WX_SCENE = "SCENE";

    /**
     * 账户状态 1 正常 0冻结
     */
    public static final int ACCOUNT_NORMAL = 1;
    public static final int ACCOUNT_FREEZE = 0;
}
