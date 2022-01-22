package xyz.xcye.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import xyz.xcye.entity.CommonResult;
import xyz.xcye.entity.Payment;
import xyz.xcye.service.PaymentService;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/15 20:17
 **/

@Slf4j
@RequestMapping("/payment")
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);

        log.info("{} payment服务插入数据{},结果{}",new Date().toString(),payment,result);
        if (result > 0) {
            return new CommonResult(200,"插入数据成功,serverPort: " + serverPort,result);
        }else {
            return new CommonResult(444,"插入数据失败,serverPort: " + serverPort,null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("{} payment服务查询数据id={},结果{}",new Date().toString(),id,payment);
        if (payment != null) {
            return new CommonResult(200,"查询数据成功,serverPort: " + serverPort,payment);
        }else {
            return new CommonResult(444,"查询数据失败,serverPort: " + serverPort,null);
        }
    }
}
