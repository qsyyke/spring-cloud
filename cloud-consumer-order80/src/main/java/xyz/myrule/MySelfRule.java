package xyz.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/17 20:47
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        //return new RandomRule();
        //return new RetryRule();
        return new RoundRobinRule();
    }
}
