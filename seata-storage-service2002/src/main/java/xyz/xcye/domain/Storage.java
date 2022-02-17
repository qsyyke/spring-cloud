package xyz.xcye.domain;

import lombok.Data;

/**
 * @author ：qsyyke
 * @description：TODO
 * @date ：2022/2/17 8:06 PM
 */

@Data
public class Storage {

    private Long id;

    /** 产品id **/
    private Long productId;

    /** 总库存 **/
    private Integer total;

    /** 已用库存 **/
    private Integer used;

    /** 剩余库存 **/
    private Integer residue;
}
