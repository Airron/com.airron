package com.airron.vo;

public class TbDictExchange {
    private Integer no;

    private String sysName;

    private String otherNanme;

    private String tbName;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getOtherNanme() {
        return otherNanme;
    }

    public void setOtherNanme(String otherNanme) {
        this.otherNanme = otherNanme == null ? null : otherNanme.trim();
    }

    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName == null ? null : tbName.trim();
    }
}