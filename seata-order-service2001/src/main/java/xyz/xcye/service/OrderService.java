package xyz.xcye.service;

import xyz.xcye.domain.Order;

public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
