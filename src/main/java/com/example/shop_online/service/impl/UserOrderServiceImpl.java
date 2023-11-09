package com.example.shop_online.service.impl;

import com.example.shop_online.entity.UserOrder;
import com.example.shop_online.mapper.UserOrderMapper;
import com.example.shop_online.service.UserOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wujiahao
 * @since 2023-11-08
 */
@Service
public class UserOrderServiceImpl extends ServiceImpl<UserOrderMapper, UserOrder> implements UserOrderService {

}
