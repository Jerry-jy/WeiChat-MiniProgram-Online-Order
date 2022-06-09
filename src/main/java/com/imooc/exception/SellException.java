package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author 金阳
 * @description
 * @create 2022-05-19 20:54
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
