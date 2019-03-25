package com.liam.point.design.strategy;

import org.springframework.stereotype.Service;

/**
 * @author: liangzy
 * @date: 2019/03/12 下午2:45
 * @desc:
 */
@Service
public class JsapiWechatPayService extends AbstractWechatPayService {

    @Override
    public WechatPayConfig constractRequestConfig() {
        WechatPayConfig wechatPayConfig = new WechatPayConfig();
        wechatPayConfig.setAppid("1111");
        wechatPayConfig.setNotifyUrl("jsapi.com");
        return wechatPayConfig;
    }
}
