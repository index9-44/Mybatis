package com.zsc.mybatis.demo.mapper;

import com.zsc.mybatis.demo.domain.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface userMapper {

    //基于配置文件完成查询操作

    public List<user> getUser(@Param("username")String username ,@Param("password") String password);

    public void plususer(@Param("user")user user);

    public void deluser(@Param("username")String username,@Param("password") String password);

    public void updateuser(@Param("user") user user);

    public void getUserById(@Param("uuid")Long uuid);
}
