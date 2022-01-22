package xyz.xcye.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.xcye.entity.CommonResult;

@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeOut();
}
