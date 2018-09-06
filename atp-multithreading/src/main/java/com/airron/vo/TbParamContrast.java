package com.airron.vo;

public class TbParamContrast {
    private Integer no;

    private Integer tbNo;

    private String wesunName;

    private String sysName;

    private String dataType;

    private Integer dataSize;

    private String example;

    private String type;

    private String defaultType;

    private String defaultName;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getTbNo() {
        return tbNo;
    }

    public void setTbNo(Integer tbNo) {
        this.tbNo = tbNo;
    }

    public String getWesunName() {
        return wesunName;
    }

    public void setWesunName(String wesunName) {
        this.wesunName = wesunName == null ? null : wesunName.trim();
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public Integer getDataSize() {
        return dataSize;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example == null ? null : example.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDefaultType() {
        return defaultType;
    }

    public void setDefaultType(String defaultType) {
        this.defaultType = defaultType == null ? null : defaultType.trim();
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName == null ? null : defaultName.trim();
    }
}