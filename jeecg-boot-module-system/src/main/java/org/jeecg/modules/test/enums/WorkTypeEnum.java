package org.jeecg.modules.test.enums;

public enum WorkTypeEnum {
    SLEEP("睡觉",1),
    DRINK("喝酒",2),
    GETCHILD("生孩子",3);
    WorkTypeEnum(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    private String name;
    private Integer code;
}
