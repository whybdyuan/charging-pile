package com.yiyuan.chargingstation.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 充电桩管理对象
 *
 * @author why
 * @date 2025年10月10日 9:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChargingPile {
    private Long id;     //充电桩编号
    private String name; //充电桩名称
    private String location; //充电桩地址
    private String type;     // 充电桩类型
    private Double power;    // 充电桩功率
    private Double chargingStandard; // 收费标准
    private String status;           // 充电桩状态
    private String area;             // 所属区域
    private LocalDateTime createTime;// 创建时间
    private LocalDateTime updateTime;// 更新时间
}