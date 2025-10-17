package com.yiyuan.member.service;

import com.yiyuan.common.core.page.PageResult;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.entity.Recharge;

/**
 * 充值记录接口
 *
 * @author why
 * @date 2025年10月09日 17:25
 */
public interface RechargeService {
    /**
     * 获取充值记录列表
     * @return
     */
    PageResult pageQuery(PageQueryDTO pageQueryDTO);

    /**
     * 修改充值记录
     * @param recharge
     */
    void editRechargeRecord(Recharge recharge);

    /**
     * 通过Id获取充值记录
     * @param id
     * @return
     */
    Recharge getRechargeById(Long id);

}
