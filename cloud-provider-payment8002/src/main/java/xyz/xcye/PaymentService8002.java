package xyz.xcye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/14 22:28
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentService8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentService8002.class,args);
    }
}
