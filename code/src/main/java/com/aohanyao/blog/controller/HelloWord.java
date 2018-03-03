package com.aohanyao.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 江俊超 on 2018-03-03.
 * Version:1.0
 * Description: 入门教程
 * ChangeLog:
 */
@Controller
@RequestMapping("/hello/")
class HelloWord {

    @RequestMapping(value = "say", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "hello word";
    }

}
