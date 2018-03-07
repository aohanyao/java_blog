package com.aohanyao.blog.dao;

import com.aohanyao.blog.bean.ArticleComment;

public interface ArticleCommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(ArticleComment record);

    int insertSelective(ArticleComment record);

    ArticleComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(ArticleComment record);

    int updateByPrimaryKey(ArticleComment record);
}