package com.aohanyao.blog.service.imp

import com.aohanyao.blog.bean.User
import com.aohanyao.blog.common.ServerResponse
import com.aohanyao.blog.dao.UserMapper
import com.aohanyao.blog.service.IUserService
import com.aohanyao.blog.utils.MD5Util
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by 江俊超 on 2018-03-03.
 * Version:1.0
 * Description:用户服务
 * ChangeLog:
 */

@Service("iUserService")
 class UserServiceImp : IUserService {

    @Autowired
    val mUserMapper: UserMapper? = null


    override fun register(user: User): ServerResponse<String>? {
        //1.检查邮箱是否存在
        val userNameExit = mUserMapper!!.checkUserNameExit(user.userName)
        if (userNameExit > 0) {
            return ServerResponse.createByErrorMessage("该用户名已存在")
        }

        //2.检查用户名是否存在
        val emailExit = mUserMapper.checkEmailExit(user.email)
        if (emailExit > 0) {
            return ServerResponse.createByErrorMessage("邮箱已存在")
        }
        //3.加密密码(盐值加密)，随机生成一个盐值
        user.userPass = MD5Util.MD5EncodeUtf8(user.userPass)
        //4.默认数据
        user.header = ""
        user.age = 18
        user.nickName = user.userName
        user.phone = ""
        user.sex = 0
        //5.插入数据
        val insertCount = mUserMapper.insert(user)
        if (insertCount <= 0) {
            return ServerResponse.createByErrorMessage("注册失败")
        }
        return ServerResponse.createBySuccess("注册成功")
    }

    override fun login(username: String, password: String): ServerResponse<User>? {

        return null
    }

    override fun selectAllUser(): ServerResponse<List<User>>? {
        return null
    }


    override fun checkEmail(email: String): ServerResponse<String>? {
        return null
    }

    override fun checkUsername(username: String): ServerResponse<String>? {
        return null
    }

    override fun getUserQuestion(username: String): ServerResponse<String>? {
        return null
    }

    override fun validUserQuestionAndAnswer(username: String, question: String, answer: String): ServerResponse<User>? {
        return null
    }

    override fun forgetPassword(username: String, oldPass: String, newPass: String): ServerResponse<String>? {
        return null
    }

    override fun loginAdmin(username: String, password: String): ServerResponse<User>? {
        return null
    }
}
