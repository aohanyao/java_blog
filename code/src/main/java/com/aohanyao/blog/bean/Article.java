package com.aohanyao.blog.bean;

import java.util.Date;

public class Article {
    private Integer articleId;

    private Integer articleTypeId;

    private String articleTitle;

    private String articleContent;

    private Date createTime;

    private Date updateTime;

    private Integer browseCount;

    private Integer commCount;

    private String abstractContent;

    private String tag;

    private String dateLink;

    public Article(Integer articleId, Integer articleTypeId, String articleTitle, String articleContent, Date createTime, Date updateTime, Integer browseCount, Integer commCount, String abstractContent, String tag, String dateLink) {
        this.articleId = articleId;
        this.articleTypeId = articleTypeId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.browseCount = browseCount;
        this.commCount = commCount;
        this.abstractContent = abstractContent;
        this.tag = tag;
        this.dateLink = dateLink;
    }

    public Article() {
        super();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public Integer getCommCount() {
        return commCount;
    }

    public void setCommCount(Integer commCount) {
        this.commCount = commCount;
    }

    public String getAbstractContent() {
        return abstractContent;
    }

    public void setAbstractContent(String abstractContent) {
        this.abstractContent = abstractContent == null ? null : abstractContent.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getDateLink() {
        return dateLink;
    }

    public void setDateLink(String dateLink) {
        this.dateLink = dateLink == null ? null : dateLink.trim();
    }
}