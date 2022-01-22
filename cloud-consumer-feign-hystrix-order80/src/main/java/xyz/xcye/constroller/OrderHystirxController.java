package xyz.xcye.constroller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.xcye.service.PaymentHystrixService;

import javax.annotation.Resource;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/18 21:57
 **/
@DefaultProperties(defaultFallback = "defaultHandlerMethod")
@RestController
public class OrderHystirxController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id) {
        String s = paymentHystrixService.paymentInfo_OK(id);
        return s;
    }
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String s = paymentHystrixService.paymentInfo_TimeOut(id);
        return s;
        //int a = 10 / 0;
        //return "sdf";
    }

    String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id) {
        return "80方法调用超时了";
    }

    @GetMapping("/consumer/payment/hystrix/default_test")
    public String default_test() {
        int a = 10 /0;
        return "this is 80's default test method";
    }

    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/default_test_test")
    public void default_test_test() {
        int a = 10 /0;
        //return "this is 80's default test method";
        System.out.println("this is 80's default test method");
    }

    public String defaultHandlerMethod() {
        return "-----80------defaultHandlerMethod";
    }
}
