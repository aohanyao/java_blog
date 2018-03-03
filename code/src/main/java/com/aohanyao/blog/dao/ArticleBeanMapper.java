package com.aohanyao.blog.dao;

import com.aohanyao.blog.bean.ArticleBean;

public interface ArticleBeanMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(ArticleBean record);

    int insertSelective(ArticleBean record);

    ArticleBean selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(ArticleBean record);

    int updateByPrimaryKey(ArticleBean record);
}