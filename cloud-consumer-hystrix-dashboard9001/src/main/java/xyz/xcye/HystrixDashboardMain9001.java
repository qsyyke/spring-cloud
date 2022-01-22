package xyz.xcye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/20 20:18
 **/
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
            SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
