package xyz.xcye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/14 22:28
 **/
@EnableDiscoveryClient //服务发现
@SpringBootApplication
@EnableEurekaClient
public class PaymentService8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentService8001.class,args);
    }
}
