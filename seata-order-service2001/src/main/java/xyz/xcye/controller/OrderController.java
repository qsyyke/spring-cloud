package xyz.xcye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.xcye.domain.CommonResult;
import xyz.xcye.domain.Order;
import xyz.xcye.service.OrderService;

/**
 * @author ：qsyyke
 * @description：TODO
 * @date ：2022/2/17 12:19 AM
 */

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);

        return new CommonResult(200,"订单创建成功");
    }
}
