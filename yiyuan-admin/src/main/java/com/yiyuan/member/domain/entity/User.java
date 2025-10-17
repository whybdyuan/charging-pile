package com.yiyuan.member.domain.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;         //用户id
    private String name;     //名字
    private String password; //密码
    private Integer status;  //用户状态（0 正常 1 禁用）
    private LocalDateTime birthday; //生日
    private String phoneNumber;     //电话号码
    private String email;           //邮箱
    private String address;         //地址
    private String avatar;          //头像
    private Integer del;            //删除标识
    private Double money;           //用户余额
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //更新时间
}
