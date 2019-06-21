package com.liam.point.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午2:46
 * @desc: 监听 okong 队列
 */
@Component
@RabbitListener(queues = "okong")
@Slf4j
public class Consumer {

    /**
     * @RabbitHandler 指定消息的处理方法
     * @param message
     */
    @RabbitHandler
    public void process(String message) {
        log.info("接收的消息为: {}", message);
    }
}