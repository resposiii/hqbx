package com.pxy.controller;


import com.pxy.pojo.Admin;
import com.pxy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@Scope("prototype")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/a_login")
    public ModelAndView login(String adminName, String password, ModelAndView mv,HttpSession session)
    {
        Admin admin =adminService.a_login(adminName,password);
        if (admin!=null)
        {
            mv.setViewName("admin");
        }
        else {
            //登录失败
            mv.addObject("message","用户名密码错误，重新登录");
            //跳转
            mv.setViewName("error");
        }
        return mv;
    }

}
