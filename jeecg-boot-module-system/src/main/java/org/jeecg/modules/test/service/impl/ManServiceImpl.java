package org.jeecg.modules.test.service.impl;

import org.jeecg.common.util.DateUtils;
import org.jeecg.modules.test.service.ImanService;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class ManServiceImpl implements ImanService {
    @Override
    public void sleep(Date time) {
        System.out.println("男人睡觉，睡觉时间为："+DateUtils.getDate("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public void drinkBeer() {
        System.out.println("男人喝酒了！");
    }
}
