package com.tophicon.www.order.service;

import com.tophicon.www.order.enity.Orders;

import java.util.List;

public interface OrderService {

   List<Orders> getList() throws Exception;

    Orders insert(Orders orders) throws Exception;
}
