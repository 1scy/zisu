package com.zisu.SpringEvent.Controller;

import cn.hutool.extra.spring.SpringUtil;
import com.zisu.SpringEvent.Producer.SmsProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author SWM
 * @create 2025-04-18-下午5:41
 * @description
 */
@SpringBootApplication
@ComponentScan("com.zisu.SpringEvent")
public class SpringEventController {

    public static void main(String[] args) {

        SpringApplication.run(SpringEventController.class, args);
        sendSmsSendMessage();
    }

    public static void sendSmsSendMessage() {
        // 发送消息
        SpringUtil.getBean(SmsProducer.class).sendSmsSendMessage();
    }


}
