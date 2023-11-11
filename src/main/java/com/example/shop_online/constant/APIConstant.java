package com.example.shop_online.constant;

/**
 * author：zhong
 * Date：2023/11/11 8:14
 */
public class APIConstant {
    /**
     * 请求头 认证名称
     */
    public final static String AUTHORIZATION = "Authorization";

    /**
     * token 加密密钥
     */
    public static String JWT_SECRET = "shopApi";

    /**
     * redis 存 token 键名
     */
    public static String APP_NAME = "shopApi";

    /**
     * 默认头像
     */
    public static String DEFAULT_AVATAR = "默认头像链接";
    /**
     * APP_ID
     */
    public static String APP_ID = "wx23e884c8023c05a1";
    /**
     * APP_SECRET
     * 密钥：6b9aca772e6f3d1de7e543ff1d1502a9
     */
    public static String APP_SECRET = "6b9aca772e6f3d1de7e543ff1d1502a9";
    /**
     * 微信调用api接口返回错误code
     */
    public static String WX_ERR_CODE = "errcode";
    /**
     * 微信调用api接口获取openid
     */
    public static String WX_OPENID = "openid";

    /**
     * token 过期时间 15天
     */
    public static long APP_TOKEN_EXPIRE_TIME = 15 * 24 * 3600L;

}
