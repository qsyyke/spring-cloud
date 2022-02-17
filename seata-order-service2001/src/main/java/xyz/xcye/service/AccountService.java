package xyz.xcye.service;

import org.springframework.web.bind.annotation.RequestParam;
import xyz.xcye.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @author ：qsyyke
 * @description：TODO
 * @date ：2022/2/17 12:15 AM
 */

public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     * @return
     */
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
