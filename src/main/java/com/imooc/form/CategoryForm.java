package com.imooc.form;

import lombok.Data;

/**
 * @author 金阳
 * @description
 * @create 2022-05-20 12:27
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
