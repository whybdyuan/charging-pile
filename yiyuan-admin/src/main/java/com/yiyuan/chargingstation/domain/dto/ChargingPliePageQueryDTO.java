package com.yiyuan.chargingstation.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.ws.soap.Addressing;

/**
 * 充电桩分页查询请求接受管理对象
 *
 * @author why
 * @date 2025-10-10 19:11
 */
@Data
public class ChargingPliePageQueryDTO {
    private Integer page;    // 当前页面
    private Integer pageSize;// 显示页面数量
    private String name;     // 充电桩名称
    private String type;     // 充电桩类型
    private String area;     // 充电桩所属区域

}
