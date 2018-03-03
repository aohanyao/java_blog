package com.aohanyao.blog.bean;

import java.util.Date;

public class UserBean {
    private String userId;

    private String userName;

    private String userPass;

    private String nickName;

    private String header;

    private Integer age;

    private Integer sex;

    private String phone;

    private Date registerTime;

    private String email;

    public UserBean(String userId, String userName, String userPass, String nickName, String header, Integer age, Integer sex, String phone, Date registerTime, String email) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.nickName = nickName;
        this.header = header;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.registerTime = registerTime;
        this.email = email;
    }

    public UserBean() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}