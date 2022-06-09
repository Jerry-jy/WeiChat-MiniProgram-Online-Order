package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 金阳
 * @description
 * @create 2022-05-19 17:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
//    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("男生最爱", 3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);

//        ProductCategory productCategory = repository.findOne(2);
//        productCategory.setCategoryType(11);
//        repository.save(productCategory);


//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(2);
//
//        productCategory.setCategoryName("男生最爱");
//        productCategory.setCategoryType(3);
//        repository.save(productCategory);
//        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
//        ProductCategory result = repository.save(productCategory);
//        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}