package com.deepak.DTO;

public class EmployeeDTO {


    public String name() {
        return name;
    }

    public EmployeeDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String Email() {
        return Email;
    }

    public EmployeeDTO setEmail(String email) {
        Email = email;
        return this;
    }

    public String Gender() {
        return Gender;
    }

    public EmployeeDTO setGender(String gender) {
        Gender = gender;
        return this;
    }

    public String Department() {
        return Department;
    }

    public EmployeeDTO setDepartment(String department) {
        Department = department;
        return this;
    }

    public int Experience() {
        return Experience;
    }

    public EmployeeDTO setExperience(int experience) {
        Experience = experience;
        return this;
    }



    private String name;
    private String Email;
    private String Gender;
    private String Department;
    private int Experience;






}
