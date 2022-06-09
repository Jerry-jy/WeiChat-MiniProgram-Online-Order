package com.imooc.enums;

import lombok.Getter;

/**
 * @author 金阳
 * @description
 * @create 2022-05-19 19:02
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}