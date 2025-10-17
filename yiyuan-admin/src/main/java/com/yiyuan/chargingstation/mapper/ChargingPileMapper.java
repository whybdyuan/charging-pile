package com.yiyuan.chargingstation.mapper;

import com.github.pagehelper.Page;
import com.yiyuan.chargingstation.domain.dto.ChargingPliePageQueryDTO;
import com.yiyuan.chargingstation.domain.entity.ChargingPile;
import org.apache.ibatis.annotations.Mapper;

/**
 * 充电桩信息持久层
 *
 * @author why
 * @date 2025-10-10 10:01
 */
@Mapper
public interface ChargingPileMapper {
    /**
     * 查询充电桩页面信息
     * @return
     */
    Page<ChargingPile> selectPage(ChargingPliePageQueryDTO pageQueryDTO);
}
