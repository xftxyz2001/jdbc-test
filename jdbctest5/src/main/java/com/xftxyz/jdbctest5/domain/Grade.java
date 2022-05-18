package com.xftxyz.jdbctest5.domain;

public class Grade {
    private String sno;
    private String cno;
    private Integer score;

    public Grade(String sno, String cno, Integer score) {
        this.sno = sno;
        this.cno = cno;
        this.score = score;
    }

    public Grade() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade [cno=" + cno + ", score=" + score + ", sno=" + sno + "]";
    }

}
