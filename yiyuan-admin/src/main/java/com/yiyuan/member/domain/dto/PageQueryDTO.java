package com.yiyuan.member.domain.dto;

import lombok.Data;

@Data
public class PageQueryDTO {
    private Integer page;      //当前页面
    private Integer pageSize;  //页面显示得数据数量
    private String name;       //用户名字
    private String phoneNumber;//电话号码
}
