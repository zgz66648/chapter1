package com.example.chapter1.entity;

public class account {
    private String username;
    private String password;
    private String phone;

    public String getPhone() {
        String pre = "+86";
        return pre + phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return username + password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
