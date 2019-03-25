package com.liam.point.controller;

import com.liam.point.design.strategy.AbstractWechatPayService;
import com.liam.point.design.strategy.WechatPayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liangzy
 * @date: 2019/03/12 下午2:51
 * @desc:
 */
@RequestMapping("/app")
@RestController
public class AppWechatPayController {


    @Qualifier("appWechatPayService")
    @Autowired
    private AbstractWechatPayService wechatPayService;

    @PostMapping("/wechatPay")
    public String wechatPay(){
        WechatPayConfig wechatPayConfig = wechatPayService.wechatPay();
        return wechatPayConfig.toString();
    }
}
