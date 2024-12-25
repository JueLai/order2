package com.tophicon.www.order.enity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("formulas")
public class formulas implements Serializable {
    @TableId(type= IdType.AUTO)
    private Integer formulaId;
    private String formulaName;
    private String formulaNumber;
}
