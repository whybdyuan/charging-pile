package com.yiyuan.member.controller;

import com.yiyuan.common.core.page.PageResult;
import com.yiyuan.common.domain.entity.Result;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.dto.UserInfoDTO;
import com.yiyuan.member.domain.entity.User;
import com.yiyuan.member.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 用户信息controller
 *
 * @author why
 * @date 2025-10-7
 */

@RestController
@RequestMapping("/admin/member/userinfo")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户信息列表
     */
    @GetMapping("/list")
    public Result<PageResult> list(PageQueryDTO pageQueryDTO){
        log.info("获取用户信息列表：{}", pageQueryDTO);
        PageResult pageResult = userService.page(pageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 获取个人信息，修改回显
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<User> getUserInfo(@PathVariable Long id){
        log.info("获取用户信息：{}", id);
        User user = userService.getUserById(id);
        return Result.success(user);
    }
    /**
     * 修改用户信息
     * @return
     */
    @PutMapping
    public Result edit(@RequestBody UserInfoDTO userInfoDTO){
        log.info("修改用户信息：{}", userInfoDTO);
        userService.editUserInfo(userInfoDTO);
        return Result.success();
    }

    /**
     * 删除用户信息
     * @return
     */
    @DeleteMapping
    public Result batchDelete(@RequestParam List<Long> ids){
        log.info("批量删除用户信息：{}",ids);
        userService.batchDeleteUser(ids);
        return Result.success();
    }
}
