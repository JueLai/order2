package com.tophicon.www.order.service.impl;

import com.anwen.mongo.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tophicon.www.order.collection.Formula;
import com.tophicon.www.order.service.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormulaServiceImpl extends ServiceImpl<Formula> implements FormulaService {

    @Override
    public Formula findByFormulaName(String formula) {
        LambdaQueryWrapper<Formula> queryWrapper= new LambdaQueryWrapper<>();
        LambdaQueryWrapper<Formula> eq = queryWrapper.eq(Formula::getFormula, formula);
        return eq.getEntity();
    }
}
