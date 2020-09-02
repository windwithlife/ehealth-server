package com.project.meetinglive.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 系统配置文件参数
 * @author hejinguo
 * @version $Id: ApplicationConfig.java, v 0.1 2019年11月18日 上午2:06:39
 */
@Component
public class ApplicationConfig {
    /**云健康小程序ID*/
    public static String wecaht_meetinglive_appid;
    /**今日预约小程序秘钥*/
    public static String wecaht_meetinglive_appsecret;
    /**云健康小程序获取openId地址*/
    public static String wecaht_meetinglive_jscode2session;
    /**全局接口调用凭据access_token*/
    public static String wecaht_meetinglive_meetinglive_accesstoken;
    /**获取小程序码*/
    public static String wecaht_meetinglive_getwxacodeunlimit;
    /**健云公众号AppId*/
    public static String publicAppId;
    /**健云公众号秘钥*/
    public static String publicSecret;
    /**公众号用户授权获取*/
    public static String userAauth2;
    /**公众号授权获取AccessToken*/
    public static String oauthAccessToken;
    /**公众号获取用户信息*/
    public static String oauthUserInfo;

    /**图片访问地址*/
    public static String upload_image_httpUrl;
    /**图片上传目录*/
    public static String upload_image_dirPath;
    /**图片访问目录*/
    public static String upload_image_path;
    /**文件上传目录*/
    public static String upload_file_dirPath;
    /**文件访问目录*/
    public static String upload_file_path;

    /**腾讯云推流域名*/
    public static String tecentCloud_live_pushServerurl;
    /**腾讯云拉流域名*/
    public static String tecentCloud_live_pullServerurl;
    /**推、拉流路径(默认是live)*/
    public static String tecentCloud_live_appName;
    /**推流防盗链Key*/
    public static String tecentCloud_live_safeChain;
    /**推流房间名前缀*/
    public static String tecentCloud_live_StreamNamePrefix;
    /**直播回调通知秘钥*/
    public static String tecentCloud_live_notifyUrlKey;
    /**腾讯云API秘钥key*/
    public static String tecentCloud_live_SecretId;
    /**腾讯云API秘钥value*/
    public static String tecentCloud_live_SecretKey;

    @Value("${wechat.xcx.meetinglive.appId}")
    public void setWecaht_meetinglive_appid(String wecaht_meetinglive_appid) {
        ApplicationConfig.wecaht_meetinglive_appid = wecaht_meetinglive_appid;
    }

    @Value("${wechat.xcx.meetinglive.appSecret}")
    public void setWecaht_meetinglive_appsecret(String wecaht_meetinglive_appsecret) {
        ApplicationConfig.wecaht_meetinglive_appsecret = wecaht_meetinglive_appsecret;
    }

    @Value("${wechat.xcx.meetinglive.jscode2session}")
    public void setWecaht_meetinglive_jscode2session(String wecaht_meetinglive_jscode2session) {
        ApplicationConfig.wecaht_meetinglive_jscode2session = wecaht_meetinglive_jscode2session;
    }

    @Value("${wechat.xcx.meetinglive.accessToken}")
    public void setWecaht_meetinglive_meetinglive_accesstoken(String wecaht_meetinglive_meetinglive_accesstoken) {
        ApplicationConfig.wecaht_meetinglive_meetinglive_accesstoken = wecaht_meetinglive_meetinglive_accesstoken;
    }

    @Value("${wechat.xcx.meetinglive.getwxacodeunlimit}")
    public void setWecaht_meetinglive_getwxacodeunlimit(String wecaht_meetinglive_getwxacodeunlimit) {
        ApplicationConfig.wecaht_meetinglive_getwxacodeunlimit = wecaht_meetinglive_getwxacodeunlimit;
    }
    
    @Value("${wechat.public.publicAppId}")
    public  void setPublicAppId(String publicAppId) {
        ApplicationConfig.publicAppId = publicAppId;
    }

    @Value("${wechat.public.publicSecret}")
    public  void setPublicSecret(String publicSecret) {
        ApplicationConfig.publicSecret = publicSecret;
    }

    @Value("${wechat.public.userAauth2}")
    public  void setUserAauth2(String userAauth2) {
        ApplicationConfig.userAauth2 = userAauth2;
    }

    @Value("${wechat.public.oauthAccessToken}")
    public  void setOauthAccessToken(String oauthAccessToken) {
        ApplicationConfig.oauthAccessToken = oauthAccessToken;
    }

    @Value("${wechat.public.oauthUserInfo}")
    public  void setOauthUserInfo(String oauthUserInfo) {
        ApplicationConfig.oauthUserInfo = oauthUserInfo;
    }

    @Value("${upload.image.httpUrl}")
    public void setUpload_image_httpUrl(String upload_image_httpUrl) {
        ApplicationConfig.upload_image_httpUrl = upload_image_httpUrl;
    }

    @Value("${upload.image.dirPath}")
    public void setUpload_image_dirPath(String upload_image_dirPath) {
        ApplicationConfig.upload_image_dirPath = upload_image_dirPath;
    }

    @Value("${upload.image.path}")
    public void setUpload_image_path(String upload_image_path) {
        ApplicationConfig.upload_image_path = upload_image_path;
    }

    @Value("${upload.file.dirPath}")
    public void setUpload_file_dirPath(String upload_file_dirPath) {
        ApplicationConfig.upload_file_dirPath = upload_file_dirPath;
    }

    @Value("${upload.file.path}")
    public void setUpload_file_path(String upload_file_path) {
        ApplicationConfig.upload_file_path = upload_file_path;
    }

    @Value("${tecentCloud.live.pushServerurl}")
    public void setTecentCloud_live_pushServerurl(String tecentCloud_live_pushServerurl) {
        ApplicationConfig.tecentCloud_live_pushServerurl = tecentCloud_live_pushServerurl;
    }

    @Value("${tecentCloud.live.safeChain}")
    public void setTecentCloud_live_safeChain(String tecentCloud_live_safeChain) {
        ApplicationConfig.tecentCloud_live_safeChain = tecentCloud_live_safeChain;
    }

    @Value("${tecentCloud.live.StreamNamePrefix}")
    public void setTecentCloud_live_StreamNamePrefix(String tecentCloud_live_StreamNamePrefix) {
        ApplicationConfig.tecentCloud_live_StreamNamePrefix = tecentCloud_live_StreamNamePrefix;
    }

    @Value("${tecentCloud.live.pullServerurl}")
    public void setTecentCloud_live_pullServerurl(String tecentCloud_live_pullServerurl) {
        ApplicationConfig.tecentCloud_live_pullServerurl = tecentCloud_live_pullServerurl;
    }

    @Value("${tecentCloud.live.notifyUrlKey}")
    public void setTecentCloud_live_notifyUrlKey(String tecentCloud_live_notifyUrlKey) {
        ApplicationConfig.tecentCloud_live_notifyUrlKey = tecentCloud_live_notifyUrlKey;
    }

    @Value("${tecentCloud.live.SecretId}")
    public void setTecentCloud_live_SecretId(String tecentCloud_live_SecretId) {
        ApplicationConfig.tecentCloud_live_SecretId = tecentCloud_live_SecretId;
    }

    @Value("${tecentCloud.live.SecretKey}")
    public void setTecentCloud_live_SecretKey(String tecentCloud_live_SecretKey) {
        ApplicationConfig.tecentCloud_live_SecretKey = tecentCloud_live_SecretKey;
    }

    @Value("${tecentCloud.live.appName}")
    public void setTecentCloud_live_appName(String tecentCloud_live_appName) {
        ApplicationConfig.tecentCloud_live_appName = tecentCloud_live_appName;
    }

}
