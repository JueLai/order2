package com.tophicon.www.order.service;

import com.tophicon.www.order.enity.batch;
import com.tophicon.www.order.exception.MyException;

import java.util.List;

public interface batchService {
    List<batch> getList() throws MyException;
}
