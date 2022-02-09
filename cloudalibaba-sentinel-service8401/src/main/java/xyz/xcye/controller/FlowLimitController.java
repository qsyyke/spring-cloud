package xyz.xcye.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author qsyyke 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/02/08 20:02
 **/

@Slf4j
@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        log.info("testA");
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info("testB");
        return "------testB";
    }


    @GetMapping("/testD")
    public String testD() {
        //暂停几秒钟线程
        /*try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        int i = 10 / 0;
        log.info("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "handlerTestHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        log.info("testHotKey方法执行，参数p1:{},p2:{}",p1,p2);
        int i = 10 / 0;
        return "-----------testHotKey, p1: " + p1 + " p2: " + p2;
    }

    public String handlerTestHotKey(String p1, String p2, BlockException exception) {
        log.warn("testHotKey的兜底方法执行,p1:{},p2:{}",p1,p2);
        return "-----------testHotKey的兜底方法执行,p1:"+p1 + ",p2:" + p2;
    }

}
