package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @author 金阳
 * @description
 * @create 2022-05-20 11:56
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}