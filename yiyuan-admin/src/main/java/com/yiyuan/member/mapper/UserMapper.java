package com.yiyuan.member.mapper;

import com.github.pagehelper.Page;
import com.yiyuan.member.domain.dto.PageQueryDTO;
import com.yiyuan.member.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {
    /**
     * 用户信息查询
     * @return
     */
    Page<User> getUserInfoList(PageQueryDTO userInfo);

    /**
     * 查询个人信息
     * @return
     */
    @Select("select * from user where id = #{id}")
    User selectUserById(Long id);

    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);

    /**
     * 删除单个或多个用户信息
     */
    void deleteUserByIds(List<Long> ids);
}
