package xyz.xcye.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import xyz.xcye.entity.Payment;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/15 19:57
 **/

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
