package com.aohanyao.blog.controller

import com.aohanyao.blog.bean.User
import com.aohanyao.blog.common.Code
import com.aohanyao.blog.common.ServerResponse
import com.aohanyao.blog.service.IUserService
import com.aohanyao.blog.vo.UserDto
import io.swagger.annotations.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by 江俊超 on 2018-03-03.
 * Version:1.0
 * Description:
 * ChangeLog:
 */
@Controller
@Api(value = "用户Controller", tags = ["前台用户所有接口"])
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var iUserService: IUserService

    /**
     * 用户注册
     */
    @ResponseBody
    @ApiOperation(value = "用户注册", notes = "用户注册")
    @RequestMapping(value = ["/register"], method = [(RequestMethod.POST)])
    @ApiImplicitParams(
            ApiImplicitParam(name = "userName", value = "用户名", required = true, defaultValue = "testUserName"),
            ApiImplicitParam(name = "email", value = "邮箱", required = true, defaultValue = "aohanyao@gmail.com"),
            ApiImplicitParam(name = "passWold", value = "密码", required = true, defaultValue = "pd123456")
    )
    @ApiResponses(
            ApiResponse(code = Code.SUCCESS, message = "注册成功"),
            ApiResponse(code = Code.ERROR, message = "注册失败")
    )
    fun register(@RequestParam(required = true) userName: String,
                 @RequestParam(required = true) email: String,
                 @RequestParam(required = true) passWold: String): ServerResponse<String> {
        //1.校验
        val user = User()
        user.email = email
        user.userName = userName
        user.userPass = passWold
        //2.插入并返回结果
        return iUserService.register(user) ?: ServerResponse.createBySuccessMessage("空指针")
    }

    @ResponseBody
    @ApiOperation(value = "用户登陆", notes = "可以使用用户名和邮箱进行登陆")
    @RequestMapping("/login", method = [(RequestMethod.GET)])
    @ApiImplicitParams(
            ApiImplicitParam(name = "emailOrUserName", value = "邮箱或者用户名", required = true, defaultValue = "aohanyao@gmail.com"),
            ApiImplicitParam(name = "passWold", value = "密码", required = true, defaultValue = "pd123456")
    )
    @ApiResponses(
            ApiResponse(code = Code.SUCCESS, message = "登陆成功"),
            ApiResponse(code = Code.ERROR, message = "错误")
    )
    fun login(@RequestParam emailOrUserName: String,
              @RequestParam passWold: String): ServerResponse<UserDto> {
        val userDto = UserDto()
        userDto.age = 20
        userDto.email = "aohanyao@gmail.com"
        userDto.header = ""
        userDto.nickName = "禁言"
        userDto.phone = "13813801380"
        userDto.sex = 1
        userDto.userName = "aohanyao"

        return ServerResponse.createBySuccess("登录成功", userDto)
    }
}