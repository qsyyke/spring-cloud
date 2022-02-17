package xyz.xcye.service;

/**
 * @author ：qsyyke
 * @description：TODO
 * @date ：2022/2/17 8:11 PM
 */


public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
