package com.example.pc.ilearn.entity;

/**
 * 保存学生信息的实体类
 * Created by he on 2016/10/1.
 */
public class Teacher {

    private String password_checked;
    private String name;
    private String college;
    private String major;
    private Integer tid;
    private Integer id;
    private String username;

    public Teacher(String password_checked, String name, String college, String major, Integer tid, Integer id, String username, String password) {
        this.password_checked = password_checked;
        this.name = name;
        this.college = college;
        this.major = major;
        this.tid = tid;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    private String password;

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

    public String getPassword_checked() {
        return password_checked;
    }

    public void setPassword_checked(String password_checked) {
        this.password_checked = password_checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}
