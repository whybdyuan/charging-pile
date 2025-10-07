package com.yiyuan.menu.service.impl;

import com.yiyuan.menu.domain.entity.Menu;
import com.yiyuan.menu.mapper.MenuMapper;
import com.yiyuan.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 获取菜单栏
     * @return
     */
    public List<Menu> getList() {
        List<Menu> list = menuMapper.getList();
        return list;
    }
}
