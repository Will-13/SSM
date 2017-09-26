package com.zk.modules.sys.entity;

import java.io.Serializable;

public class ActiveUser implements Serializable {
    private int userid;//用户id（主键）
    private String usercode;// 用户账号
    private String username;// 用户名称

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
