package xyz.xcye.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/01/14 22:48
 *
 * 这是支付模块的实体
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    private long id;
    private String serial;
}