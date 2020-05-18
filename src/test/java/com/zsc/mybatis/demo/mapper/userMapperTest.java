package com.zsc.mybatis.demo.mapper;

import com.zsc.mybatis.demo.domain.user;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.*;
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@SpringBootTest
@RunWith(SpringRunner.class)
public class userMapperTest {
    //注入
    @Autowired
    userMapper userMapper;

    //查询操作
    @Test
    public void getUser(){
        List<user> list=userMapper.getUser("admin","123");
        System.out.println(list);
    }

    //插入操作
    @Test
    public void plususer(){
        Date date=new Date();
        user user=new user();
        user.setUsername("谁都不许动我的砖");
        user.setPassword("辣鸡一个");
//        user.setRegisterIp(request.getRemoteHost());
        user.setCreateTime(date);
        user.setRegisterIp("0.0.0.0");
        user.setRole(1);
        System.out.println(user.toString());
        userMapper.plususer(user);
        System.out.println(user.toString());
    }

    //删除测试
    @Test
    public void deluser(){
        userMapper.deluser("王五","789");
    }

    //更新测试
    @Test
    public void updateuser(){
        //获取当前username=“蔡徐坤”,password="985"的用户
        user user=new user();
        List<user> list;
        list=userMapper.getUser("蔡徐坤","211");
        //获取完后赋值给user
        user=list.get(0);
        user.setUsername("蔡徐坤好帅");
        user.setPassword("真的吗？");
        //下面就不再修改了，根据自己需要修改对应的属性
        userMapper.updateuser(user);


    }
}