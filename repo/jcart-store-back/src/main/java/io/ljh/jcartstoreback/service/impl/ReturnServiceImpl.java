package io.ljh.jcartstoreback.service.impl;

import io.ljh.jcartstoreback.dao.ReturnMapper;
import io.ljh.jcartstoreback.po.Return;
import io.ljh.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer create(Return ireturn) {
        returnMapper.insertSelective(ireturn);
        Integer returnId = ireturn.getReturnId();
        return returnId;
    }
}
