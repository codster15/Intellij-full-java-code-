package com.deepakIT.entity;

public class Student {
    public Integer sid() {
        return sid;
    }

    public Student setSid(Integer sid) {
        this.sid = sid;
        return this;
    }

    public String sname() {
        return sname;
    }

    public Student setSname(String sname) {
        this.sname = sname;
        return this;
    }

    public String gender() {
        return gender;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Integer marks() {
        return marks;
    }

    public Student setMarks(Integer marks) {
        this.marks = marks;
        return this;
    }

    private Integer sid;
    private String sname ;
    private String gender ;
    private Integer marks;

}
