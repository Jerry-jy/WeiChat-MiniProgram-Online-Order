package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author 金阳
 * @description
 * @create 2022-05-19 21:40
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
