package com.yiyuan.member.service;

import com.yiyuan.common.core.page.PageResult;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.dto.UserInfoDTO;
import com.yiyuan.member.domain.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 分页查询用户信息
     * @param pageQueryDTO
     * @return
     */
    PageResult page(PageQueryDTO pageQueryDTO);

    /**
     * 查询用户个人信息
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 修改个人信息
     * @param userInfoDTO
     */
    void editUserInfo(UserInfoDTO userInfoDTO);

    /**
     * 批量删除用户信息
     * @param ids
     */
    void batchDeleteUser(List<Long> ids);
}
