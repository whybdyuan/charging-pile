package com.yiyuan.common.enums;

import lombok.Getter;

/**
 * 充电桩类型枚举类
 *
 * @author why
 * @date 2025-10-10
 */
@Getter  //get方法，获取枚举的值
public enum ChargingPileType {
    /**
     * 交流类型
     */
    AC("交流充电桩"),
    /**
     * 直流类型
     */
    DC("直流充电桩");

    private final String chargingPileType;

    ChargingPileType(String chargingPileType) {
        this.chargingPileType = chargingPileType;
    }
}
