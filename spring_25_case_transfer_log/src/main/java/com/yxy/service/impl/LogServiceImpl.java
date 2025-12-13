package com.yxy.service.impl;

import com.yxy.dao.LogDao;
import com.yxy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogDao logDao;

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由"+out+"到"+in+"，金额："+money);
    }
}
