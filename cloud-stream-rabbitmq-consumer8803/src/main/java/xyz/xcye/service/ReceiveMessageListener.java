package xyz.xcye.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


/**
 * @author qsyyke 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/02/05 12:43
 **/
@Slf4j
@Component
@EnableBinding(value = Sink.class)
public class ReceiveMessageListener {

    @Value("${server.port}")
    private String port;

    @StreamListener(value = Sink.INPUT)
    public void inputMsg(Message<String> message) {
        String payload = message.getPayload();
        log.info("消费者1号 ---> 端口: {},message: {}",port,payload);
    }
}
