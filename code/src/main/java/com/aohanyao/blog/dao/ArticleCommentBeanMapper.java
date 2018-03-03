package com.aohanyao.blog.dao;

import com.aohanyao.blog.bean.ArticleCommentBean;

public interface ArticleCommentBeanMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(ArticleCommentBean record);

    int insertSelective(ArticleCommentBean record);

    ArticleCommentBean selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(ArticleCommentBean record);

    int updateByPrimaryKey(ArticleCommentBean record);
}