package com.liam.point.design.strategy;

import org.springframework.stereotype.Service;

/**
 * @author: liangzy
 * @date: 2019/03/12 下午2:45
 * @desc:
 */
@Service
public abstract class AbstractWechatPayService {

    public WechatPayConfig wechatPay(){
        WechatPayConfig wechatPayConfig = this.constractBaseRequestConfig();
        System.out.println("base toString:"+wechatPayConfig.toString());
        return wechatPayConfig;
    }


    public abstract WechatPayConfig constractRequestConfig();

    public WechatPayConfig constractBaseRequestConfig(){
        WechatPayConfig wechatPayConfig = new WechatPayConfig();
//        wechatPayConfig.setAppid("aaa");
//        wechatPayConfig.setNotifyUrl("base.com");
        wechatPayConfig.setMchid("baseMchid");
        WechatPayConfig abstractConfig = this.constractRequestConfig();
//        BeanUtils.(wechatPayConfig,abstractConfig);
        return abstractConfig;
    }

}
