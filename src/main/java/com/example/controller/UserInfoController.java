package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
   
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    public String userInfo(){
       return "userInfo";
    }
   
    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    public String userInfoAdd(){
       return "userInfoAdd";
    }
   
}
