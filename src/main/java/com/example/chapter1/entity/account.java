package com.example.chapter1.entity;

public class account {
    private String username;
    private String password;

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
