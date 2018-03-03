package com.aohanyao.blog.bean;

public class ArticleTagBean {
    private Integer id;

    private String tagName;

    public ArticleTagBean(Integer id, String tagName) {
        this.id = id;
        this.tagName = tagName;
    }

    public ArticleTagBean() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
}