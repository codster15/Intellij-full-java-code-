package com.deepu.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "student_tbl")
public class StudentEntity {

    public CompositeKeyEntity compositeKey() {
        return compositeKey;
    }

    public StudentEntity setCompositeKey(CompositeKeyEntity compositeKey) {
        this.compositeKey = compositeKey;
        return this;
    }

    public String name() {
        return name;
    }

    public StudentEntity setName(String name) {
        this.name = name;
        return this;
    }

    public int Marks() {
        return Marks;
    }

    public StudentEntity setMarks(int marks) {
        Marks = marks;
        return this;
    }

    //--------------------------------------------------------------------------------------------------
    @EmbeddedId
    private CompositeKeyEntity compositeKey;


    @Column (name = "Student_name")
    private String name;


    private int Marks;


    @Override
    public String toString() {
        return "StudentEntity{" +
                "compositeKey=" + compositeKey +
                ", name='" + name + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
