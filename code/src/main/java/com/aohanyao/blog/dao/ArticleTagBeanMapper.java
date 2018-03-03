package com.aohanyao.blog.dao;

import com.aohanyao.blog.bean.ArticleTagBean;

public interface ArticleTagBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTagBean record);

    int insertSelective(ArticleTagBean record);

    ArticleTagBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleTagBean record);

    int updateByPrimaryKey(ArticleTagBean record);
}