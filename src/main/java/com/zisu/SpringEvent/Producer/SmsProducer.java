package com.zisu.SpringEvent.Producer;

import cn.hutool.extra.spring.SpringUtil;
import com.zisu.SpringEvent.Controller.SpringEventMessage;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author SWM
 * @create 2025-04-18-下午5:22
 * @description
 */
@Slf4j
@Component
public class SmsProducer {

    @Resource
    private ApplicationContext applicationContext;

    public void sendSmsSendMessage() {
        SpringEventMessage message = new SpringEventMessage();
        message.setName("zisu");
        message.setMessage("你好");

        // 通过 ApplicationContext 发送事件 或者 通过 SpringUtil 发送事件
        applicationContext.publishEvent(message);
        SpringUtil.publishEvent(message);
    }
}
