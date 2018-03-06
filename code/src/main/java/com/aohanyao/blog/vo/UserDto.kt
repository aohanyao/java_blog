package com.aohanyao.blog.vo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

/**
 * Created by 江俊超 on 2018-03-06.
 * Version:1.0
 * Description:用户值模型
 * ChangeLog:
 */
@ApiModel(value = "用户值对象", description = "用户值对象")
class UserDto {
    @ApiModelProperty("用户名")
    var userName: String? = ""

    @ApiModelProperty("昵称")
    var nickName: String? = ""

    @ApiModelProperty("头像")
    var header: String? = ""

    @ApiModelProperty("年龄")
    var age: Int? = 18

    @ApiModelProperty("性别-> 0:女 1:男")
    var sex: Int? = 1

    @ApiModelProperty("手机号码")
    var phone: String? = ""

    @ApiModelProperty("邮箱")
    var email: String? = ""


}
