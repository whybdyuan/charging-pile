package com.yiyuan.menu.mapper;

import com.yiyuan.menu.domain.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper{
    /**
     * 查询菜单栏
     * @return
     */
    List<Menu> getList();
}
