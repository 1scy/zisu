package com.zisu.SpringEvent.Consumer;

import com.zisu.SpringEvent.Controller.SpringEventMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author SWM
 * @create 2025-04-18-下午5:23
 * @description
 */
@Slf4j
@Component
public class SmsSendConsumer {


    @EventListener
    @Async // Spring Event 默认在 Producer 发送的线程，通过 @Async 实现异步
    public void onMessage(SpringEventMessage message) {

        log.info("[onMessage][消息内容({})]", message);
    }

}
