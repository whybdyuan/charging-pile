package com.yiyuan.menu.domain.vo;

import com.yiyuan.menu.domain.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuVO {
    private Integer menuId;
    private String menuName;
    private String path;
    private String component;
    private Integer orderId;
    private String icon;
    private List<MenuVO> children;

}
