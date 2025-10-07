package com.yiyuan.menu.service;

import com.yiyuan.menu.domain.entity.Menu;

import java.util.List;

public interface MenuService {
    /**
     * 获取菜单栏
     * @return
     */
    List<Menu> getList();
}
