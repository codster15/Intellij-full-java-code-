package com.deepu.Entity;


import javax.persistence.*;

@Entity
@Table (name = "emp")
//@NamedQuery( name = "Query1" , query = "from EmpEntity e where e.location = ?1")
public class EmpEntity {

    public Integer id() {
        return id;
    }

    public EmpEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public EmpEntity setName(String name) {
        this.name = name;
        return this;
    }

    public int salary() {
        return salary;
    }

    public EmpEntity setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public String location() {
        return location;
    }

    public EmpEntity setLocation(String location) {
        this.location = location;
        return this;
    }

    @Id
    @Column(name = "id")
    Integer id;


    @Column (name = "name")
    String name;

    @Column (name = "salary")
    int salary;

    @Column (name = "location")
    String location;

    @Override
    public String toString() {
        return "EmpEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
