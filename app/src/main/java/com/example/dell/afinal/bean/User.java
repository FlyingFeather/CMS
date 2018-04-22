package com.example.dell.afinal.bean;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

public class User extends BmobUser {
    //身份：学生或教师
    private String identity;
    //头像
    private BmobFile headFile;
    //个性签名
    private String sign;
    //昵称
    private String nickName;
    //性别
    private Integer sex;
    //数据
    private BmobFile dbFile;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public BmobFile getHeadFile() {
        return headFile;
    }

    public void setHeadFile(BmobFile headFile) {
        this.headFile = headFile;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

}
