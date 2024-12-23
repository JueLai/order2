package com.tophicon.www.order.controller;


import com.anwen.mongo.toolkit.FunctionUtil;
import com.tophicon.www.order.collection.Formula;
import com.tophicon.www.order.collection.test;
import com.tophicon.www.order.commit.HttpResult;
import com.tophicon.www.order.enity.Orders;
import com.tophicon.www.order.service.batchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tophicon.www.order.service.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class controller {

    @Autowired
    private OrderService orderService;

    @Autowired
    private batchService batchService;

    @Autowired
    private FormulaService formulaService;

    @Autowired
    private testService testService;
    @PostMapping("/order/add")
    HttpResult<List<Formula>> addOrder(@RequestBody Orders orders) throws Exception {
        List<Formula> u1=formulaService.list();
        u1.forEach(System.out::println);
        return HttpResult.success(u1);
   }

   @PostMapping("/formula/find")
   HttpResult<Formula> findFormula(@RequestBody String formula) throws Exception {
        return HttpResult.success(formulaService.findByFormulaName(formula));
   }

}
