package xyz.xcye.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.xcye.domain.CommonResult;

@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     * 扣除库存
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
