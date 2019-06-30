package com.wechat.cms.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_login")
public class LoginUser {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="user_name",length=20)
    private String userName;
    @Column(name="pass_word",length=20)
    private String passWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
