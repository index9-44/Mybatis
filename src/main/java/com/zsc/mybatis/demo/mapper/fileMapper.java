package com.zsc.mybatis.demo.mapper;

import com.zsc.mybatis.demo.domain.comment;
import com.zsc.mybatis.demo.domain.file;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface fileMapper {
//    //查询附件  传入评论的id查询有多少个这样的文件
    public List<file> listByCommentId(Long commentId);

}
