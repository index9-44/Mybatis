package com.zsc.mybatis.demo.mapper;

import com.zsc.mybatis.demo.domain.comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface commentMapper {

    //查看评论及其附件  ????
    public List<comment> getCommentDetails(@Param("commentId") Long commentId);

    //模糊查询
    public List<comment> listLikeComment(@Param("comment") String comment);

}
