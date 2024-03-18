package com.deepak.DTO;

public class VewEmoDto {
    private String department ;
    private String experience;
    private String gender;

    public String department() {
        return department;
    }

    public VewEmoDto setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String experience() {
        return experience;
    }

    public VewEmoDto setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public String gender() {
        return gender;
    }

    public VewEmoDto setGender(String gender) {
        this.gender = gender;
        return this;
    }
}
