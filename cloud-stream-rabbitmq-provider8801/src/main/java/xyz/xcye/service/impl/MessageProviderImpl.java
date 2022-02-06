package xyz.xcye.service.impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import xyz.xcye.service.MessageProvider;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author qsyyke 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/02/05 11:36
 **/

@EnableBinding(value = Source.class)
public class MessageProviderImpl implements MessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String message = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(message).build());
        return message;
    }
}
