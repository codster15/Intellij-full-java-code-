package com.deepu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "emp")
public class EmployeeEntity {

    @Id
    @Column (name = "id")
    int id;


    @Column (name = "name")
    String name;

    @Column (name = "salary")
    int salary;

    @Column (name = "location")
    String location;

    //------------------------------------------------------------------------

    public int id() {
        return id;
    }

    public EmployeeEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public EmployeeEntity setName(String name) {
        this.name = name;
        return this;
    }

    public int salary() {
        return salary;
    }

    public EmployeeEntity setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public String location() {
        return location;
    }

    public EmployeeEntity setLocation(String location) {
        this.location = location;
        return this;
    }




    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
