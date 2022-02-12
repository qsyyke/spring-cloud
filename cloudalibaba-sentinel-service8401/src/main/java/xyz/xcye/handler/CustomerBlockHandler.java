package xyz.xcye.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import xyz.xcye.entity.CommonResult;

/**
 * @author qsyyke 程钦义
 * @blog https://www.xcye.xyz
 * @date 2022/02/09 22:40
 **/

public class CustomerBlockHandler {
    public static CommonResult handleException1(BlockException exception) {
        return new CommonResult(2020,"自定义的限流处理信息 方法1号......CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020,"自定义的限流处理信息 方法2号......CustomerBlockHandler");
    }
}
