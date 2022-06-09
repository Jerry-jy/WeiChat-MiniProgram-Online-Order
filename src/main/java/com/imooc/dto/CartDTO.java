package com.imooc.dto;

import lombok.Data;

/**
 * @author 金阳
 * @description
 * @create 2022-05-19 21:04
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
