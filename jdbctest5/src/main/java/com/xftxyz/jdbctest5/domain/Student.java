package com.xftxyz.jdbctest5.domain;

public class Student {
    private String sno;
    private String sname;
    private String sex;
    private Integer sage;
    private String dno;
    private String dormno;

    public Student(String sno, String sname, String sex, Integer sage, String dno, String dormno) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.sage = sage;
        this.dno = dno;
        this.dormno = dormno;
    }

    public Student() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDormno() {
        return dormno;
    }

    public void setDormno(String dormno) {
        this.dormno = dormno;
    }

    @Override
    public String toString() {
        return "Student [dno=" + dno + ", dormno=" + dormno + ", sage=" + sage + ", sex=" + sex + ", sname=" + sname
                + ", sno=" + sno + "]";
    }

}
