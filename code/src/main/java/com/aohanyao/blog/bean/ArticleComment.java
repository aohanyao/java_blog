package com.aohanyao.blog.bean;

import java.util.Date;

public class ArticleComment {
    private Integer commentId;

    private Integer articleId;

    private Integer userId;

    private String commentContent;

    private Integer starCount;

    private Date commentCount;

    private Integer replyCommentId;

    private Integer status;

    public ArticleComment(Integer commentId, Integer articleId, Integer userId, String commentContent, Integer starCount, Date commentCount, Integer replyCommentId, Integer status) {
        this.commentId = commentId;
        this.articleId = articleId;
        this.userId = userId;
        this.commentContent = commentContent;
        this.starCount = starCount;
        this.commentCount = commentCount;
        this.replyCommentId = replyCommentId;
        this.status = status;
    }

    public ArticleComment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getStarCount() {
        return starCount;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    public Date getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Date commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Integer replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}