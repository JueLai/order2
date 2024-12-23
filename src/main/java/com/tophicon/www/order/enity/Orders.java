package com.tophicon.www.order.enity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("orders")
public class Orders implements Serializable {
    @TableId(type = IdType.AUTO)
    private int orderId;
    private String orderNumber;

    public Orders(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Orders() {
    }
}
