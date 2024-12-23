package com.tophicon.www.order.enity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("batch")
public class batch {
    @TableId(type = IdType.AUTO)
    private int batchId;
    private String orderNumber;
    private String batchNumber;
    private String customerName;
    private String formulaNumber;
    private String productName;
    private Integer singleBatch6;
    private String unit;
    private Integer state;
    private String data;
}
