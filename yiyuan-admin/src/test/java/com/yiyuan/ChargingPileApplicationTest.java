package com.yiyuan;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yiyuan.chargingstation.domain.dto.ChargingPliePageQueryDTO;
import com.yiyuan.chargingstation.domain.entity.ChargingPile;
import com.yiyuan.chargingstation.mapper.ChargingPileMapper;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.entity.Recharge;
import com.yiyuan.member.domain.entity.User;
import com.yiyuan.member.mapper.RechargeMapper;
import com.yiyuan.member.mapper.UserMapper;
import com.yiyuan.member.service.RechargeService;
import com.yiyuan.menu.mapper.MenuMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ChargingPileApplicationTest {

    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RechargeMapper rechargeMapper;
    @Autowired
    private ChargingPileMapper chargingPileMapper;

    @Test
    void test(){
//        User user = User.builder()
//                .id(1L)
//                .name("张三")
//                .password("123456")
//                .email("zs@qq.com")
//                .birthday(LocalDateTime.now())
//                .avatar("zs.png")
//                .address("河南平顶山")
//                .phoneNumber("12112346985")
//                .updateTime(LocalDateTime.now())
//                .build();
//        userMapper.update(user);
//
        ChargingPliePageQueryDTO pageQueryDTO = new ChargingPliePageQueryDTO();
        pageQueryDTO.setPage(1);
        pageQueryDTO.setPageSize(5);
        Page<ChargingPile> page = chargingPileMapper.selectPage(pageQueryDTO);
        System.out.println(page.getTotal());
        System.out.println(page.getResult());
    }

    @Test
    void pageHelperTest(){
        PageQueryDTO userInfo = new PageQueryDTO();
        userInfo.setName("刘");
        userInfo.setPage(1);
        userInfo.setPageSize(10);
        PageHelper.startPage(userInfo.getPage(),userInfo.getPageSize());
        Page<User> p = userMapper.getUserInfoList(userInfo);
        System.out.println(p.getResult());
    }
}
