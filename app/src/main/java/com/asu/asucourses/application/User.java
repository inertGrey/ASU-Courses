package com.asu.asucourses.application;

import android.app.Application;

public class User extends Application {
    private String userId;
    private String userName;
    private String email;
    private String gpa;
    private String level;
    public static boolean isLogged = false;

    public User(String userId, String username, String email, String gpa, String level) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.gpa = gpa;
        this.level = level;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
