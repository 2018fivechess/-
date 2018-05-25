package com.pku.codingma.client;

/**
 * Created by ma on 2016/4/24.
 */
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private int id;
    private String phoneNumber;
    private String password;
    private String userName;
    private String emailAddress;
    private Date registerTime;
    public static String PHONENUMBER = "phoneNumber";
    public static String PASSWORD = "passWord";
    public static String USERNAME = "userName";

    public User(String phoneNumber, String password, String userName){
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        registerTime = new Date();
    }

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

}