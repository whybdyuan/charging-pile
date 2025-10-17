package com.yiyuan.member.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 充值表对象
 *
 * @author why
 * @date 2025-10-9
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recharge {
    private Long id;              //编号Id
    private Double rechargeMoney; //充值金额
    private String rechargeMethod;//充值方式
    private LocalDateTime rechargeTime;
    private Long userId;          //用户Id
    private User user;            //充值用户
}
