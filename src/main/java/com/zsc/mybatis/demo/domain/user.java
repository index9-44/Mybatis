package com.zsc.mybatis.demo.domain;

import lombok.Data;

import java.util.Date;
@Data
public class user {
    private Long uuid;
    private String username;
    private String password;
    private Date createTime;
    private String registerIp;
    private int role;
}
