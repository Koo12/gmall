package com.koo12.gmall.user.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class MemberInfo {

    private String id;
    private String memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private int status;
    private Timestamp createTime;
    private String icon;
    private int gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private int sourceType;
    private int integration;
    private int growth;
    private int luckeyCount;
    private int historyIntegration;


    public String getId() {
        return id;
    }

    public String getMemberLevelId() {
        return memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhone() {
        return phone;
    }

    public int getStatus() {
        return status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public String getIcon() {
        return icon;
    }

    public int getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public int getSourceType() {
        return sourceType;
    }

    public int getIntegration() {
        return integration;
    }

    public int getGrowth() {
        return growth;
    }

    public int getLuckeyCount() {
        return luckeyCount;
    }

    public int getHistoryIntegration() {
        return historyIntegration;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMemberLevelId(String memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public void setIntegration(int integration) {
        this.integration = integration;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public void setLuckeyCount(int luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public void setHistoryIntegration(int historyIntegration) {
        this.historyIntegration = historyIntegration;
    }
}
