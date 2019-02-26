package com.liam.point.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午2:34
 * @desc:
 */

@Data
@ConfigurationProperties(prefix = "spring.rabbitmq")
public class RabbitConstants {
    public static final String EXCHANGE = "bootExchange";
    public static final String ROUTINGKEY = "routingkey";
    public static final String QUEUE = "bootQueue";

    private String host;
    private Integer port;
    private String username;
    private String password;
    private Boolean publisherConfirms;
    private String virtualHost;

}
