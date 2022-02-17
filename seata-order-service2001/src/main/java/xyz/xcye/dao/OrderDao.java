package xyz.xcye.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.xcye.domain.Order;

/**
 * @author ：qsyyke
 * @description：TODO
 * @date ：2022/2/16 11:56 PM
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单金额
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
