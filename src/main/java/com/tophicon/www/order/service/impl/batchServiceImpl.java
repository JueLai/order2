package com.tophicon.www.order.service.impl;

import com.tophicon.www.order.commit.ResultCodeEnum;
import com.tophicon.www.order.enity.batch;
import com.tophicon.www.order.exception.MyException;
import com.tophicon.www.order.mapper.batchMapper;
import com.tophicon.www.order.service.batchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class batchServiceImpl implements batchService {
    @Autowired
    batchMapper batchMapper;
    @Override
    public List<batch> getList() throws MyException {
        return batchMapper.selectList(null);
    }
}
