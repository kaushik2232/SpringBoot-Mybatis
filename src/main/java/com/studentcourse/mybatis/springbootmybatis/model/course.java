package com.studentcourse.mybatis.springbootmybatis.model;

public class course {

    private int cid;
    private String cname;
    private String ctaught;
    private int sid;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtaught() {
        return ctaught;
    }

    public void setCtaught(String ctaught) {
        this.ctaught = ctaught;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
