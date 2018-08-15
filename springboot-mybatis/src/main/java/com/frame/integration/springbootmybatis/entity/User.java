package com.frame.integration.springbootmybatis.entity;

public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String phone;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [userId=");
        builder.append(userId);
        builder.append(", userName=");
        builder.append(userName);
        builder.append(", password=");
        builder.append(password);
        builder.append(", phone=");
        builder.append(phone);
        builder.append("]");
        return builder.toString();
    }
}
