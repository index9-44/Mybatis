package com.zsc.mybatis.demo.mapper;

import com.zsc.mybatis.demo.domain.comment;
import com.zsc.mybatis.demo.domain.file;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@SpringBootTest
@RunWith(SpringRunner.class)
public class commentMapperTest {
    @Autowired
    commentMapper commentMapper;
    @Test
    public void getCommentDetails(){
        //查询第1000条评论，及其下面所有附件和评论人
        List<comment> commentList= commentMapper.getCommentDetails(1000L);
        System.out.println(commentList);
    }

    @Test
    public void listLikeComment(){
        List<comment> commentsList=commentMapper.listLikeComment("就");
        System.out.println(commentsList);
    }
}