package com.liam.point.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午2:29
 * @desc:
 */

@Configuration
public class RabbitConfig {

    /**
     * 定义一个名为：oKong 的队列
     * @return
     */
    @Bean
    public Queue okongQueue() {
        return new Queue("okong");
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {

            /**
             * @param correlationData 唯一标识，有了这个唯一标识，我们就知道可以确认（失败）哪一条消息了
             * @param ack
             * @param cause
             */
            @Override
            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
                System.out.println("=====消息进行消费了======");
                if(ack){
                    System.out.println("消息id为: "+correlationData+"的消息，已经被ack成功");
                }else{
                    System.out.println("消息id为: "+correlationData+"的消息，消息nack，失败原因是："+cause);
                }
            }
        });
        return rabbitTemplate;
    }
}
