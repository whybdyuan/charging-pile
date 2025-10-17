package com.yiyuan.chargingstation.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yiyuan.chargingstation.domain.dto.ChargingPliePageQueryDTO;
import com.yiyuan.chargingstation.domain.entity.ChargingPile;
import com.yiyuan.chargingstation.mapper.ChargingPileMapper;
import com.yiyuan.chargingstation.service.ChargingPileService;
import com.yiyuan.common.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 充电桩信息service业务层
 *
 * @author why
 * @date 2025-10-10 10:02
 */
@Service
public class ChargingPileServiceImpl implements ChargingPileService {

    @Autowired
    private ChargingPileMapper chargingPileMapper;

    /**
     * 分页查询充电桩列表信息
     * @param
     * @return
     */
    public PageResult page(ChargingPliePageQueryDTO pageQueryDTO) {
        PageHelper.startPage(pageQueryDTO.getPage(),pageQueryDTO.getPageSize());
        Page<ChargingPile> page = chargingPileMapper.selectPage(pageQueryDTO);
        return new PageResult(page.getTotal(),page.getResult());
    }
}
