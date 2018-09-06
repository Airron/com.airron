package com.airron.vo;

public class WarnProject {
    private Integer wnFid;

    private Integer wnId;

    private String wnFname;

    private String wnName;

    private String wnFileName;

    private String wnStatus;

    private Integer wnForfeit;

    private String wnComment;

    private String wnRules;

    private String wnDutyDept;

    private Integer wnTbNo;

    private String wnFilePath;

    public Integer getWnFid() {
        return wnFid;
    }

    public void setWnFid(Integer wnFid) {
        this.wnFid = wnFid;
    }

    public Integer getWnId() {
        return wnId;
    }

    public void setWnId(Integer wnId) {
        this.wnId = wnId;
    }

    public String getWnFname() {
        return wnFname;
    }

    public void setWnFname(String wnFname) {
        this.wnFname = wnFname == null ? null : wnFname.trim();
    }

    public String getWnName() {
        return wnName;
    }

    public void setWnName(String wnName) {
        this.wnName = wnName == null ? null : wnName.trim();
    }

    public String getWnFileName() {
        return wnFileName;
    }

    public void setWnFileName(String wnFileName) {
        this.wnFileName = wnFileName == null ? null : wnFileName.trim();
    }

    public String getWnStatus() {
        return wnStatus;
    }

    public void setWnStatus(String wnStatus) {
        this.wnStatus = wnStatus == null ? null : wnStatus.trim();
    }

    public Integer getWnForfeit() {
        return wnForfeit;
    }

    public void setWnForfeit(Integer wnForfeit) {
        this.wnForfeit = wnForfeit;
    }

    public String getWnComment() {
        return wnComment;
    }

    public void setWnComment(String wnComment) {
        this.wnComment = wnComment == null ? null : wnComment.trim();
    }

    public String getWnRules() {
        return wnRules;
    }

    public void setWnRules(String wnRules) {
        this.wnRules = wnRules == null ? null : wnRules.trim();
    }

    public String getWnDutyDept() {
        return wnDutyDept;
    }

    public void setWnDutyDept(String wnDutyDept) {
        this.wnDutyDept = wnDutyDept == null ? null : wnDutyDept.trim();
    }

    public Integer getWnTbNo() {
        return wnTbNo;
    }

    public void setWnTbNo(Integer wnTbNo) {
        this.wnTbNo = wnTbNo;
    }

    public String getWnFilePath() {
        return wnFilePath;
    }

    public void setWnFilePath(String wnFilePath) {
        this.wnFilePath = wnFilePath == null ? null : wnFilePath.trim();
    }
}