package com.tophicon.www.order.collection;

import com.anwen.mongo.annotation.ID;
import com.anwen.mongo.annotation.collection.CollectionName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@CollectionName("formula")
public class Formula implements Serializable {
    @ID
    private Object id;
    String formula;
    String formula_name;
    String version;
    Object product;
    List<Production> production;
    List<Material> material;
    List<Parameter> parameter;



    @Data
    public static class Product {
        String name;
        String code;
        String unit;
        String nums;

        public Product(String name, String code, String unit, String nums) {
            this.name = name;
            this.code = code;
            this.unit = unit;
            this.nums = nums;
        }

        public Product() {
        }
    }

    @Data
    public static class Production {

        String name;
        String type;
        String value;
        List<Map<String,String>> selete_list;

        public Production() {
        }


    }


    @Data
    public static class Material {


        String material_code;
        String material_number;
        String material_unit;
        String material_name;
        public Material() {
        }
    }

    @Data
    public static class Parameter {

        public Parameter() {
        }

        String parameter_name;
        String parameter_var;
        String parameter_number;
        String parameter_unit;
    }
}






