package com.aohanyao.blog.bean;

import java.util.Date;

public class ArticleType {
    private Integer articleTypeId;

    private String articleTypeCode;

    private String articleTypeName;

    private Date createTime;

    private Integer status;

    public ArticleType(Integer articleTypeId, String articleTypeCode, String articleTypeName, Date createTime, Integer status) {
        this.articleTypeId = articleTypeId;
        this.articleTypeCode = articleTypeCode;
        this.articleTypeName = articleTypeName;
        this.createTime = createTime;
        this.status = status;
    }

    public ArticleType() {
        super();
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleTypeCode() {
        return articleTypeCode;
    }

    public void setArticleTypeCode(String articleTypeCode) {
        this.articleTypeCode = articleTypeCode == null ? null : articleTypeCode.trim();
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName == null ? null : articleTypeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}