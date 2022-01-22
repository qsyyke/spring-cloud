package xyz.xcye.service.impl;

import org.springframework.stereotype.Component;
import xyz.xcye.service.PaymentHystrixService;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/19 23:28
 **/

@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "impl ------paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "impl----------------paymentInfo_TimeOut";
    }
}
