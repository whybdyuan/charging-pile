package com.yiyuan.menu.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Menu {
    private Integer menuId; //菜单id
    private String menuName; //菜单名字
    private Integer parentId; //父菜单id
    private String path; //菜单路由地址
    private Integer orderId; //显示顺序
    private String component; //组件地址
    private Integer status; //菜单状态 0 正常 1 停用
    private String icon; //菜单图标
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //更新时间
    private String createBy; //创建人
    private String updateBy; //更新人
}
