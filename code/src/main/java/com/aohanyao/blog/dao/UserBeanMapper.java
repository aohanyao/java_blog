package com.aohanyao.blog.dao;

import com.aohanyao.blog.bean.UserBean;
import org.mapstruct.Mapper;

@Mapper
public interface UserBeanMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);

    /**
     * 检查用户名是否存在
     * @param userName 用户名
     * @return 行数
     */
    int checkUserNameExit(String userName);

    /**
     * 检查邮箱是否存在
     * @param email 邮箱
     * @return 行数
     */
    int checkEmailExit(String email);
}