package com.yiyuan.member.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yiyuan.common.core.page.PageResult;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.dto.UserInfoDTO;
import com.yiyuan.member.domain.entity.User;
import com.yiyuan.member.mapper.UserMapper;
import com.yiyuan.member.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 分页查询用户信息
     * @return
     */
    public PageResult page(PageQueryDTO pageQueryDTO) {
        //开始分页查询
        PageHelper.startPage(pageQueryDTO.getPage(), pageQueryDTO.getPageSize());

        Page<User> pageResult = userMapper.getUserInfoList(pageQueryDTO);

        return new PageResult(pageResult.getTotal(),pageResult.getResult());
    }

    /**
     * 查询用户个人信息
     * @param id
     * @return
     */
    public User getUserById(Long id) {
        return userMapper.selectUserById(id);
    }

    /**
     * 修改个人信息
     * @param userInfoDTO
     */
    public void editUserInfo(UserInfoDTO userInfoDTO) {
        User user = User.builder()
                .id(userInfoDTO.getId())
                .name(userInfoDTO.getName())
                .password(userInfoDTO.getPassword())
                .birthday(userInfoDTO.getBirthday())
                .phoneNumber(userInfoDTO.getPhoneNumber())
                .avatar(userInfoDTO.getAvatar())
                .email(userInfoDTO.getEmail())
                .address(userInfoDTO.getAddress())
                .updateTime(LocalDateTime.now()).build();
        userMapper.update(user);
    }

    /**
     * 批量删除用户信息
     * @param ids
     */
    public void batchDeleteUser(List<Long> ids) {
        userMapper.deleteUserByIds(ids);
    }
}
