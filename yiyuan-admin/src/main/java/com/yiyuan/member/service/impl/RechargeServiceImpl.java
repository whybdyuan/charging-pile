package com.yiyuan.member.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yiyuan.common.core.page.PageResult;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.entity.Recharge;
import com.yiyuan.member.mapper.RechargeMapper;
import com.yiyuan.member.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 充值记录service业务层处理
 *
 * @author why
 * @date 2025年10月09日 17:28
 */
@Service
public class RechargeServiceImpl implements RechargeService {

    @Autowired
    private RechargeMapper rechargeMapper;

    /**
     * 充值记录信息分页查询
     * @return
     */
    public PageResult pageQuery(PageQueryDTO pageQueryDTO) {
        PageHelper.startPage(pageQueryDTO.getPage(),pageQueryDTO.getPageSize());
        Page<Recharge> page = rechargeMapper.selectPageQuery(pageQueryDTO);
        return new PageResult(page.getTotal(),page.getResult());
    }


    /**
     * 修改充值记录
     * @param recharge
     */
    public void editRechargeRecord(Recharge recharge) {
        rechargeMapper.updateRechargeRecord(recharge);
    }

    /**
     * 获取充值记录
     * @param id
     * @return
     */
    @Override
    public Recharge getRechargeById(Long id) {
        return rechargeMapper.selectRechargeById(id);
    }
}
