package com.yiyuan.member.mapper;

import com.github.pagehelper.Page;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.entity.Recharge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 充值记录表持久层
 *
 * @author why
 * @date 2025年10月09日 17:30
 */
@Mapper
public interface RechargeMapper {

    /**
     * 充值记录分页查询
     * @param pageQueryDTO
     * @return
     */
    Page<Recharge> selectPageQuery(PageQueryDTO pageQueryDTO);

    /**
     * 更新充值记录
     * @param recharge
     */
    void updateRechargeRecord(Recharge recharge);

    /**
     * 通过Id查询充值记录
     * @param id
     * @return
     */
    @Select("select * from recharge_record where id = #{id}")
    Recharge selectRechargeById(Long id);
}
