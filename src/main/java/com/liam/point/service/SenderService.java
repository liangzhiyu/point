package com.liam.point.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: liangzy
 * @date: 2019/06/21 上午11:24
 * @desc:
 */

@Service
public class SenderService implements RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnCallback {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMq() throws InterruptedException {
        this.rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.convertAndSend("user", "6666666");
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println("=====已消费======");
        if(ack){
            System.out.println("消息: "+correlationData+"，已经被ack成功");
        }else{
            System.out.println("消息: "+correlationData+"，nack，失败原因是："+cause);
        }
    }

    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        System.out.println("sender return success" + message.toString());
    }
}
