package com.tophicon.www.order.service.impl;


import com.tophicon.www.order.enity.Orders;
import com.tophicon.www.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tophicon.www.order.mapper.orderMapper;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    orderMapper orderMapper;
    boolean a=true;

    @Override
    public List<Orders> getList()  {
        System.out.println(123);
        orderMapper.insert(new Orders("测试用"));
        return orderMapper.selectList(null);

    }

    @Override
    public Orders insert(Orders orders) throws Exception {
//        if(a){
//
//            throw new RuntimeException("测试异常");
//        }
        int c=1/0;
        return null;
    }
}
