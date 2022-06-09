package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author 金阳
 * @description
 * @create 2022-05-20 18:37
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
