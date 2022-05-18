package com.xftxyz.jdbctest5.domain;

public class Department {
    private String dno;
    private String dname;
    private String head;

    public Department(String dno, String dname, String head) {
        this.dno = dno;
        this.dname = dname;
        this.head = head;
    }

    public Department() {
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Department [dname=" + dname + ", dno=" + dno + ", head=" + head + "]";
    }
}
