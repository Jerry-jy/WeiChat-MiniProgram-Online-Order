package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @author 金阳
 * @description
 * @create 2022-05-20 12:36
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
