package com.yiyuan.chargingstation.controller;

import com.yiyuan.chargingstation.domain.dto.ChargingPliePageQueryDTO;
import com.yiyuan.chargingstation.service.ChargingPileService;
import com.yiyuan.common.core.page.PageResult;
import com.yiyuan.common.domain.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 充电桩信息Controller
 *
 * @author why
 * @date 2025-10-10 9:59
 */
@RestController
@RequestMapping("/admin/chargingstation/chargingpile")
@Slf4j
public class ChargingPileController {

    @Autowired
    private ChargingPileService chargingPileService;

    /**
     * 获取充电桩信息列表
     * @param
     * @return
     */
    @GetMapping("/list")
    public Result<PageResult> list(ChargingPliePageQueryDTO pageQueryDTO) {
        log.info("获取充电桩列表信息：{}", pageQueryDTO);
        PageResult pageResult = chargingPileService.page(pageQueryDTO);
        return Result.success(pageResult);
    }
}
