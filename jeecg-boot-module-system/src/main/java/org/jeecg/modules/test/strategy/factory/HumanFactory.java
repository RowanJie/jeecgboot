package org.jeecg.modules.test.strategy.factory;

import org.jeecg.modules.test.enums.WorkTypeEnum;
import org.jeecg.modules.test.service.IhumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HumanFactory {

    @Autowired
    private Map<String, IhumanService> humanMap;

    public IhumanService getHumanFactory(WorkTypeEnum workTypeEnum){
        IhumanService HumanService = null;
        try {
            if(workTypeEnum.getCode() == WorkTypeEnum.SLEEP.getCode()){
                HumanService = humanMap.get("womanServiceImpl");
            }else if(workTypeEnum.getCode() == WorkTypeEnum.DRINK.getCode()){
                HumanService = humanMap.get("manServiceImpl");
            }else if(workTypeEnum.getCode() == WorkTypeEnum.GETCHILD.getCode()){
                HumanService = humanMap.get("womanServiceImpl");
            }
        }catch (Exception e){
            System.out.println("获取bean失败！");
        }
        return HumanService;
    }

}
