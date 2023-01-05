package org.jeecg.modules.test.service.impl;

import org.jeecg.common.util.DateUtils;
import org.jeecg.modules.test.service.IwomanService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class WomanServiceImpl implements IwomanService {
    @Override
    public void sleep(Date time) {
        System.out.println("女人睡觉，睡觉时间为："+ DateUtils.getDate("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public void getChild() {
        System.out.println("女人生娃了！");
    }
}
