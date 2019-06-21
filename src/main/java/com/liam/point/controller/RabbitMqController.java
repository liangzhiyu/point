package com.liam.point.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: liangzy
 * @date: 2019/04/09 下午5:35
 * @desc:
 */
@RestController
public class RabbitMqController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @PostMapping("/sendMq")
    public void sendMq() throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            amqpTemplate.convertAndSend("okong", "6666666666666");
        }
    }

}
