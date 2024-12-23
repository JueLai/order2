package com.tophicon.www.order.service;

import com.anwen.mongo.service.IService;
import com.tophicon.www.order.collection.Formula;

public interface FormulaService extends IService<Formula> {
    /*
    formula是配料编号
     */
    public Formula findByFormulaName(String formula);

}
