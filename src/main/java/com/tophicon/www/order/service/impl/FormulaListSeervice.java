package com.tophicon.www.order.service.impl;

import com.tophicon.www.order.enity.formulas;
import com.tophicon.www.order.mapper.FormulasMapper;
import com.tophicon.www.order.service.FormulaListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FormulaListSeervice implements FormulaListService {
    @Autowired
    FormulasMapper formulaListMapper;


    /*
    返回所有配方
     */
    @Override
    public List<formulas> getList() throws Exception {
        return formulaListMapper.selectList(null);
    }
}
