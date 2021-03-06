package com.xrd.znsbgl.entity;

import java.sql.Timestamp;

public class LoginLog {
    private Integer id;
    private Integer adminid;
    private Timestamp logintime;//Timestamp 登录时间 跟数据库对应
    private String ip;//IP地址
    private Admin admin;

    public LoginLog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Timestamp getLogintime() {
        return logintime;
    }

    public void setLogintime(Timestamp logintime) {
        this.logintime = logintime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
                "id=" + id +
                ", adminid=" + adminid +
                ", logintime=" + logintime +
                ", ip='" + ip + '\'' +
                ", admin=" + admin +
                '}';
    }
}
