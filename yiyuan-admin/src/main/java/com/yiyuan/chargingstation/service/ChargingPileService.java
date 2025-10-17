package com.yiyuan.chargingstation.service;

import com.yiyuan.chargingstation.domain.dto.ChargingPliePageQueryDTO;
import com.yiyuan.chargingstation.domain.entity.ChargingPile;
import com.yiyuan.common.core.page.PageResult;

/**
 * 充电桩信息接口
 *
 * @author why
 * @date 2025-10-10 10:02
 */
public interface ChargingPileService {

    /**
     * 获取充电桩分页信息
     * @param
     * @return
     */
    PageResult page(ChargingPliePageQueryDTO pageQueryDTO);
}
