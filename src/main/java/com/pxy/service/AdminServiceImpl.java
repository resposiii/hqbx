package com.pxy.service;

import com.pxy.dao.AdminMapper;
import com.pxy.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Admin a_login(String adminName, String password) {
        return adminMapper.findByNameAndPassword(adminName,password);
    }

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }
}
