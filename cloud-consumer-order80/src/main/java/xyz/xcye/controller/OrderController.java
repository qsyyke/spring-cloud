package xyz.xcye.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import xyz.xcye.entity.CommonResult;
import xyz.xcye.entity.Payment;
import xyz.xcye.config.ServiceUrl;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/15 21:23
 **/

@Slf4j
@RestController
@RequestMapping("/consumer")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private ServiceUrl serviceUrl;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        log.info("{} consumer服务插入数据{}",new Date().toString(),payment);
        return restTemplate.postForObject(serviceUrl.getPaymentUrl() + "/payment/create",
                payment,CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        log.info("{} consumer服务查询数据id={}",new Date().toString(),id);
        return restTemplate.getForObject(serviceUrl.getPaymentUrl() + "/payment/get/" + id,
                CommonResult.class,id);
    }

    @GetMapping("/payment/getForEntity/{id}")
    public ResponseEntity getPaymentByIdEntity(@PathVariable("id") long id) {
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(serviceUrl.getPaymentUrl() + "/payment/get/" + id,CommonResult.class);
        return forEntity;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        String result = restTemplate.getForObject("http://localhost:8001/payment/zipkin/", String.class);
        return result;
    }
}
