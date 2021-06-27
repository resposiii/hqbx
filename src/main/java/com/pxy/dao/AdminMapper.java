package com.pxy.dao;

import com.pxy.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    //根据用户名密码查询
    Admin findByNameAndPassword(@Param("adminName")String adminName
            , @Param("password")String password);
}