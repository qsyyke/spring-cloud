package xyz.xcye.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.xcye.service.MessageProvider;

import javax.annotation.Resource;

/**
 * @author qsyyke 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/02/05 11:42
 **/

@Slf4j
@RestController
public class SendMessageController {

    @Resource
    private MessageProvider provider;

    @GetMapping("/sendMessage")
    public String sendMsg() {
        String send = provider.send();
        log.info("发送 {}",send);
        return "成功发送";
    }
}
