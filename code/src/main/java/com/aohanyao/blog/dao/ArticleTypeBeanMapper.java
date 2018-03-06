package com.aohanyao.blog.dao;

import com.aohanyao.blog.bean.ArticleTypeBean;
import org.mapstruct.Mapper;

@Mapper
public interface ArticleTypeBeanMapper {
    int deleteByPrimaryKey(Integer articleTypeId);

    int insert(ArticleTypeBean record);

    int insertSelective(ArticleTypeBean record);

    ArticleTypeBean selectByPrimaryKey(Integer articleTypeId);

    int updateByPrimaryKeySelective(ArticleTypeBean record);

    int updateByPrimaryKey(ArticleTypeBean record);
}