package xyz.xcye.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/15 21:19
 *
 * 这是一个服务的url配置项，也就是可以直接在application.yml文件中，修改我们需要的其他服务
 * 的url
 **/
@Data
@Component
@ConfigurationProperties(prefix = "consumer80")
public class ServiceUrl {
    private String paymentUrl;
}
