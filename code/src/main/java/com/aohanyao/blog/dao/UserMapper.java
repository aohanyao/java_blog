package com.aohanyao.blog.dao;

import com.aohanyao.blog.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

//    int checkUserNameExit(String userName);

    /**
     * 检查邮箱是否存在
     *
     * @param email 邮箱
     * @return 行数
     */
    int checkEmailExit(String email);

    int checkUserName(String userName);
}