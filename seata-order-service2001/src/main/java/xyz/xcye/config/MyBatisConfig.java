package xyz.xcye.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：qsyyke
 * @description：TODO
 * @date ：2022/2/17 12:21 AM
 */

@MapperScan({"xyz.xcye.dao"})
@Configuration
public class MyBatisConfig {

}
