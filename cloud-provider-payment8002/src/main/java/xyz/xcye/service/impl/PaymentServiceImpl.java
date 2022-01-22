package xyz.xcye.service.impl;

import org.springframework.stereotype.Service;
import xyz.xcye.dao.PaymentDao;
import xyz.xcye.entity.Payment;
import xyz.xcye.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/15 20:07
 **/

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
