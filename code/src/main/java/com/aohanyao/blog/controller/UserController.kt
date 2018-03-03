package com.aohanyao.blog.controller

import com.aohanyao.blog.bean.UserBean
import com.aohanyao.blog.common.ServerResponse
import com.aohanyao.blog.service.IUserService
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by 江俊超 on 2018-03-03.
 * Version:1.0
 * Description:
 * ChangeLog:
 */
@Controller
@RequestMapping("/user")
class UserController {

    @Autowired
    val iUserService: IUserService? = null

    /**
     * 用户注册
     */
    @ApiOperation(value = "注册", notes = "用户注册")
    @ApiImplicitParam(name = "user", value = "用户详细信息", required = true)
    @RequestMapping(value = "/", method = [(RequestMethod.POST)])
    fun register(@ModelAttribute user: UserBean): ServerResponse<String> {
        //1.校验


        //2.插入并返回结果
        return iUserService!!.register(user)
    }
}