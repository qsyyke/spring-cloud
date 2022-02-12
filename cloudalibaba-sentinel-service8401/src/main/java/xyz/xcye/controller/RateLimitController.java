package xyz.xcye.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.xcye.entity.CommonResult;
import xyz.xcye.entity.Payment;
import xyz.xcye.handler.CustomerBlockHandler;

/**
 * @author qsyyke 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/02/09 21:45
 **/

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handlerByResource")
    public CommonResult byResource() {
        return new CommonResult(200,"按资源名称限流测试OK",new Payment(2020,"serial001"));
    }

    public CommonResult handlerByResource(BlockException exception) {
        return new CommonResult(444,"兜底方法--->按资源名称限流测试OK" + exception.getClass().getCanonicalName());
    }

    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200,"按资源路径限流测试OK",new Payment(2020,"serial001"));
    }

    @GetMapping("/byCustomer")
    @SentinelResource(value = "byCustomer",blockHandlerClass = CustomerBlockHandler.class,blockHandler = "handleException1")
    public CommonResult byCustomer() {
        return new CommonResult(200,"自定义兜底");
    }
}
