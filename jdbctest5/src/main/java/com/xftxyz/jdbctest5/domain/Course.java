package com.xftxyz.jdbctest5.domain;

public class Course {
    private String cno;
    private String cname;
    private String cpno;
    private Integer credit;
    private String teacher;

    public Course(String cno, String cname, String cpno, Integer credit, String teacher) {
        this.cno = cno;
        this.cname = cname;
        this.cpno = cpno;
        this.credit = credit;
        this.teacher = teacher;
    }

    public Course() {
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course [cname=" + cname + ", cno=" + cno + ", cpno=" + cpno + ", credit=" + credit + ", teacher="
                + teacher + "]";
    }
}
