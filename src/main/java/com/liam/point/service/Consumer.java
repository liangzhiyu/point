package com.liam.point.service;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午2:46
 * @desc: 监听 user 队列
 */
@Component
@RabbitListener(queues = "user")
@Slf4j
public class Consumer {

    /**
     * @param message
     * @RabbitHandler 指定消息的处理方法
     */
    @RabbitHandler
    public void process(String messageStr, Channel channel, Message message) {
        log.info("接收的消息为: {}", messageStr);
        try {
            //通知服务器此消息已经被消费，可从队列删掉， 这样以后就不会重发，否则后续还会在发
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);

        //ack返回false，并重新回到队列，api里面解释得很清楚
//        channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);

        //丢弃这条消息
//        channel.basicNack(message.getMessageProperties().getDeliveryTag(), false,false);

        //拒绝消息
//        channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);

    }
}