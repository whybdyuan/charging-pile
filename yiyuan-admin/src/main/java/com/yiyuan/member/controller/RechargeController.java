package com.yiyuan.member.controller;

import com.yiyuan.common.core.page.PageResult;
import com.yiyuan.common.domain.entity.Result;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.entity.Recharge;
import com.yiyuan.member.service.RechargeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 充值记录Controller
 *
 * @author why
 * @date 2025年10月09日 17:19
 */

@RestController
@RequestMapping("/admin/member/recharge")
@Slf4j
public class RechargeController {

    @Autowired
    private RechargeService rechargeService;


    /**
     * 获取充值记录信息列表
     * @param pageQueryDTO
     * @return
     */
    @GetMapping("/list")
    private Result<PageResult> page(PageQueryDTO pageQueryDTO) {
        log.info("获取充值记录信息列表：{}", pageQueryDTO);
        PageResult pageResult = rechargeService.pageQuery(pageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 修改充值记录信息
     * @param recharge
     * @return
     */
    @PutMapping
    private Result edit(@RequestBody Recharge recharge) {
        rechargeService.editRechargeRecord(recharge);
        return Result.success();
    }

    /**
     * 获取充值记录详细信息，修改时回显
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    private Result<Recharge> getRechargeById(@PathVariable Long id) {
        return Result.success(rechargeService.getRechargeById(id));
    }

    /**
     * 批量删除充值记录信息
     * @param ids
     * @return
     */
    @DeleteMapping
    private Result batchRemove(@RequestParam List<Long> ids) {
        rechargeService.batchRemove(ids);
        return Result.success();
    }
}
