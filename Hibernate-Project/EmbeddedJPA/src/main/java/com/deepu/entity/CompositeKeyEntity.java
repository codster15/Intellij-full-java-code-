package com.deepu.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompositeKeyEntity implements Serializable {
    public int StudentRoll() {
        return StudentRoll;
    }

    public CompositeKeyEntity setStudentRoll(int studentRoll) {
        StudentRoll = studentRoll;
        return this;
    }

    public char section() {
        return section;
    }

    public CompositeKeyEntity setSection(char section) {
        this.section = section;
        return this;
    }

    @Column (name = "Student_Roll")
    private int StudentRoll ;

    @Column (name = "Student_Section")
    private char section;

}
