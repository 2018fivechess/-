package com.example.junruitian.Logaction;

import java.io.Serializable;
import java.util.Date;
//import java.sql.Date;

public class User implements Serializable {
    private int id;
    private String phoneNumber;
    private String password;
    private String userName;
    private String emailAddress;
    private Date registerTime;
    //用于URL传参和取参时的key
    public static String PHONENUMBER = "phoneNumber";
    public static String PASSWORD = "passWord";
    public static String USERNAME = "userName";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    //构造函数
    public User(String phoneNumber,String password,String userName){
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;

        registerTime = new Date();
    }
    //属性的get与set方法不再贴出

}
