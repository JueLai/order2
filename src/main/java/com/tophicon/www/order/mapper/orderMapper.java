package com.tophicon.www.order.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tophicon.www.order.enity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface orderMapper extends BaseMapper<Orders> {
}
