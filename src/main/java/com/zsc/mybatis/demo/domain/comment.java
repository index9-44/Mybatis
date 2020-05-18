package com.zsc.mybatis.demo.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class comment {
    Long commentId;
    Long uuid;
    String comment;
    Date createTime;
    List<file> fileList;        //用来存储评论下的文件属性
    user user;                  //用来存储这条评论是某位user发布的
}
