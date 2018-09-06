package com.airron.vo;

import java.util.Date;

public class WarnProPlan {
    private String wnProLockNo;

    private String wnProStatus;

    private String wnProIfClean;

    private String wnProDept;

    private Date wnProInputDate;

    private Date wnProDate;

    private String wnProLine;

    private String wnProCode;

    private String wnProName;

    private Integer wnProNum;

    private String wnProUser;

    public String getWnProLockNo() {
        return wnProLockNo;
    }

    public void setWnProLockNo(String wnProLockNo) {
        this.wnProLockNo = wnProLockNo == null ? null : wnProLockNo.trim();
    }

    public String getWnProStatus() {
        return wnProStatus;
    }

    public void setWnProStatus(String wnProStatus) {
        this.wnProStatus = wnProStatus == null ? null : wnProStatus.trim();
    }

    public String getWnProIfClean() {
        return wnProIfClean;
    }

    public void setWnProIfClean(String wnProIfClean) {
        this.wnProIfClean = wnProIfClean == null ? null : wnProIfClean.trim();
    }

    public String getWnProDept() {
        return wnProDept;
    }

    public void setWnProDept(String wnProDept) {
        this.wnProDept = wnProDept == null ? null : wnProDept.trim();
    }

    public Date getWnProInputDate() {
        return wnProInputDate;
    }

    public void setWnProInputDate(Date wnProInputDate) {
        this.wnProInputDate = wnProInputDate;
    }

    public Date getWnProDate() {
        return wnProDate;
    }

    public void setWnProDate(Date wnProDate) {
        this.wnProDate = wnProDate;
    }

    public String getWnProLine() {
        return wnProLine;
    }

    public void setWnProLine(String wnProLine) {
        this.wnProLine = wnProLine == null ? null : wnProLine.trim();
    }

    public String getWnProCode() {
        return wnProCode;
    }

    public void setWnProCode(String wnProCode) {
        this.wnProCode = wnProCode == null ? null : wnProCode.trim();
    }

    public String getWnProName() {
        return wnProName;
    }

    public void setWnProName(String wnProName) {
        this.wnProName = wnProName == null ? null : wnProName.trim();
    }

    public Integer getWnProNum() {
        return wnProNum;
    }

    public void setWnProNum(Integer wnProNum) {
        this.wnProNum = wnProNum;
    }

    public String getWnProUser() {
        return wnProUser;
    }

    public void setWnProUser(String wnProUser) {
        this.wnProUser = wnProUser == null ? null : wnProUser.trim();
    }
}