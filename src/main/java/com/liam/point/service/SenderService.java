package com.liam.point.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: liangzy
 * @date: 2019/06/21 上午11:24
 * @desc:
 *  ConfirmCallback：消息发送到 Broker后触发回调，确认消息是否到达 Broker 服务器，即确认是否正确到达Exchange中。
 *  ReturnCallback：消息失败返回，在交换器路由不到队列时触发回调，该方法可以不使用，因为交换器和队列是在代码里绑定的，
 *  如果消息成功投递到Broker后几乎不存在绑定队列失败，除非你代码写错了。
 *
 */

@Service
@Slf4j
public class SenderService implements RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnCallback {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMq() throws InterruptedException {
        this.rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.convertAndSend("user", "6666666");
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        log.info("=====已消费======");
        if(ack){
            log.info("消息: "+correlationData+"，已经被ack成功");
        }else{
            log.info("消息: "+correlationData+"，nack，失败原因是："+cause);
        }
    }

    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        log.info("sender return success" + message.toString());
    }
}
