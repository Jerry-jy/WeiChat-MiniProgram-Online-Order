package com.imooc.VO;

import lombok.Data;

/**
 * @author 金阳
 * @description
 * @create 2022-05-19 19:14
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}