package xyz.xcye;

import org.aspectj.weaver.ast.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/18 15:12
 **/

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain83.class,args);
    }
}
