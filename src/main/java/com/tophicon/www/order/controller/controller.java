package com.tophicon.www.order.controller;


import com.tophicon.www.order.collection.Formula;
import com.tophicon.www.order.commit.HttpResult;
import com.tophicon.www.order.enity.*;
import com.tophicon.www.order.service.batchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tophicon.www.order.service.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class controller {

    @Autowired
    private OrderService orderService;

    @Autowired
    private batchService batchService;

    @Autowired
    private FormulaService formulaService;

    @Autowired
    private FormulaListService formulaListService;

    @PostMapping("/order/add")
    HttpResult<List<Formula>> addOrder(@RequestBody Orders orders) throws Exception {
        List<Formula> u1=formulaService.list();
        u1.forEach(System.out::println);
        return HttpResult.success(u1);
   }
   //   根据配方编号查询配方
   @PostMapping("/formula/find")
   HttpResult<Formula> findFormula(@RequestBody String formula) throws Exception {
        return HttpResult.success(formulaService.findByFormulaName(formula));
   }

    @GetMapping("/formula/getList")
    HttpResult<List<formulas>> getList() throws Exception {
        return HttpResult.success(formulaListService.getList());
    }

}
