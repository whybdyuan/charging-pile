package com.yiyuan.member.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDTO {
    private Long id;         //用户id
    private String name;     //名字
    private String password; //密码
    private LocalDateTime birthday; //生日
    private String phoneNumber;     //电话号码
    private String email;           //邮箱
    private String address;         //地址
    private String avatar;          //头像
}