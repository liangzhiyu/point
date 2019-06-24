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
        //channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);

        //ack返回false，并重新回到队列，api里面解释得很清楚
        //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);

        //丢弃这条消息
        //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false,false);

        //拒绝消息
        //channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);


        /*参数说明：
        basicAck 方法需要传递两个参数
        deliveryTag（唯一标识 ID）：当一个消费者向 RabbitMQ 注册后，会建立起一个 Channel ，RabbitMQ 会用 basic.deliver 方法向消费者推送消息，这个方法携带了一个 delivery tag， 它代表了 RabbitMQ 向该 Channel 投递的这条消息的唯一标识 ID，是一个单调递增的正整数，delivery tag 的范围仅限于 Channel
        multiple：为了减少网络流量，手动确认可以被批处理，当该参数为 true 时，则可以一次性确认 delivery_tag 小于等于传入值的所有消息

        basicNack方法需要传递三个参数
        deliveryTag（唯一标识 ID）：同上
        multiple：同上
        requeue： true ：重回队列，false ：丢弃，我们在nack方法中必须设置 false，否则重发没有意义。

        basicReject方法需要传递两个参数
        deliveryTag（唯一标识 ID）：同上
        requeue：同上*/
    }
}