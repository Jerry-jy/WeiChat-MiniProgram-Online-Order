package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 金阳
 * @description
 * @create 2022-05-20 12:22
 */
@Data
public class ProductForm {


    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 类目编号. */
    private Integer categoryType;
}
