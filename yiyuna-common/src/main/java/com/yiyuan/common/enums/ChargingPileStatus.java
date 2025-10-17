package com.yiyuan.common.enums;

import lombok.Getter;

/**
 * 充电桩状态枚举类
 *
 * @author why
 * @date 2025-10-10
 */
@Getter
public enum ChargingPileStatus {
    /**
     * 空闲
     */
    AVAILABLE("空闲"),
    /**
     * 充电
     */
    CHARGING("充电"),
    /**
     * 故障
     */
    FAULT("故障"),
    /**
     * 维护
     */
    MAINTENANCE("维护");

    private final String status;

    ChargingPileStatus (String status) {
        this.status = status;
    }
}
