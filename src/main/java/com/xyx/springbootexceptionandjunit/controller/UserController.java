package com.xyx.springbootexceptionandjunit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    //抛出空指针异常
    @RequestMapping("/showInfo")
    public String showInfo(){
        //故意让程序出现异常 java.lang.NullPointerException
        String str = null;
        str.length();
        //并不会跳转到 ok.html 而是去往 error.html
        return "ok";
    }

    //抛出数学异常，除数不能为 0
    @RequestMapping("/showInfo2")
    public String showInfo2(){
        int a = 10 / 0;
        return "ok";
    }
}
