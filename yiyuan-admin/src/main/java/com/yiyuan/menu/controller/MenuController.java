package com.yiyuan.menu.controller;

import com.yiyuan.common.domain.entity.Result;
import com.yiyuan.menu.domain.entity.Menu;
import com.yiyuan.menu.domain.vo.MenuVO;
import com.yiyuan.menu.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/admin/menu")
@Slf4j
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/list")
    public Result<List<MenuVO>> list(){
        log.info("获取菜单栏信息");
        List<Menu> menus = menuService.getList();
        System.out.println(menus);
        //根菜单目录
        List<MenuVO> menuVOList = new ArrayList<>();
        //所有菜单
        Map<Integer,MenuVO> menuVOMap = new HashMap<>();
        //遍历菜单集合，把菜单转化为响应式对象，放入map集合中存放
        menus.forEach(menu -> {
            MenuVO menuVO = MenuVO.builder()
                    .menuId(menu.getMenuId())
                    .menuName(menu.getMenuName())
                    .path(menu.getPath())
                    .component(menu.getComponent())
                    .icon(menu.getIcon())
                    .orderId(menu.getOrderId())
                    .children(new ArrayList<>())
                    .build();
            menuVOMap.put(menu.getMenuId(),menuVO);
        });
//        System.out.println(menuVOMap);
        //再次遍历菜单集合，找到菜单之间的对应关系，并按照对应关系存放响应出去
        for (Menu menu : menus) {
            if (menu.getParentId() == 0) {
                menuVOList.add(menuVOMap.get(menu.getMenuId()));
            } else {
                MenuVO parentMenuVO = menuVOMap.get(menu.getParentId());
                if(parentMenuVO != null){
                    if(parentMenuVO.getChildren() == null){
                        parentMenuVO.setChildren(new ArrayList<>());
                    }
                    parentMenuVO.getChildren().add(menuVOMap.get(menu.getMenuId()));
                }
            }
        }
//        System.out.println(menuVOList);
        return Result.success(menuVOList);
    }
}
