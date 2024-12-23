package com.tophicon.www.order.collection;

import com.anwen.mongo.annotation.ID;
import com.anwen.mongo.enums.IdTypeEnum;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class test implements Serializable {
    @ID(type = IdTypeEnum.OBJECT_ID)
    private Object Id;
    private Map<String,String> name;
    private Object data;

    public test() {
        this.name=new HashMap<>();
        this.name.put("name","张三");
        this.data="123";
    }
}
