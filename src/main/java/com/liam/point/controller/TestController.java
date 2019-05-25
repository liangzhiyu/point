package com.liam.point.controller;

import com.liam.point.design.strategy.WechatPayConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author: liangzy
 * @date: 2019/04/09 下午5:35
 * @desc:
 */
@RestController
public class TestController {

    @PostMapping("/wechatPay")
    public Integer wechatPay() throws InterruptedException {
        return a();
    }

    public synchronized Integer a() throws InterruptedException {
//        Thread.sleep(1000);
        int i = new Random().nextInt(10);
        System.out.println(i);
        return i;
    }
}
