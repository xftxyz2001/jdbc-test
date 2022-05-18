package com.xftxyz.jdbctest5.domain;

public class Dorm {
    private String dormno;
    private String tele;

    public Dorm(String dormno, String tele) {
        this.dormno = dormno;
        this.tele = tele;
    }

    public Dorm() {
    }

    public String getDormno() {
        return dormno;
    }

    public void setDormno(String dormno) {
        this.dormno = dormno;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "Dorm [dormno=" + dormno + ", tele=" + tele + "]";
    }
}
