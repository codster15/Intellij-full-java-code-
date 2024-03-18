package com.RealPracticeStart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class employee {




    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }


    public static void main(String[] args) {
        List<employee> list = new ArrayList<>();
        list.add(new employee(1,"jhansi" ,32,"Female" , "HR", 2011,                  25000.0));
        list.add(new employee(2,"Smith" ,25,"Male" , "Sales", 2015,             13500.0));
        list.add(new employee(3,"David" ,29,"Male" , "Infrastructure", 2012,    18000.0));
        list.add(new employee(4,"Orlen" ,28,"Male" , "Development", 2014,       25000.0));
        list.add(new employee(5,"Charles" ,27,"Male" , "HR", 2013,               25000.0));
        list.add(new employee(6,"Cathy" ,43,"Male" , "Security", 2016,          25000.0));
        list.add(new employee(7,"Ramesh" ,35,"Male" , "Finance", 2010,              25000.0));
        list.add(new employee(8,"Suresh " ,31,"Male" , "Development", 2015,             25000.0));
        list.add(new employee(9,"Gita " ,24,"Female" , "Sales", 2016,                   25000.0));
        list.add(new employee(10,"Mahesh" ,38,"Male" , "Security", 2015,            25000.0));
        list.add(new employee(11,"Gauri " ,27,"Female" , "Infrastructure", 2014,        25000.0));
        list.add(new employee(12,"Nitin" ,25,"Male" , "Development", 2016,              25000.0));
        list.add(new employee(13,"Swathi" ,27,"Female" , "Finance", 2013,               25000.0));
        list.add(new employee(14,"Buttler" ,24,"Male" , "Sales", 2017,              25000.0));
        list.add(new employee(15,"Ashok" ,23,"Male" , "Infrastructure", 2018,           25000.0));
        list.add(new employee(16,"Sanvi" ,26,"Female" , "Development", 2015,            25000.0));


//        Stream<employee> stream1 = list.stream();
//        List<String> male = stream1
//                .filter(e -> e.gender.equals("Male"))
//                .map(e -> e.name)
//                .collect(Collectors.toList());
//
//
//      male.stream().forEach(m-> System.out.println(m));
//
//        // .forEach(m-> System.out.println(m.name + " ----> male"));
//
//        System.out.println();
//        System.out.println("=======================================================================");
//        System.out.println();
//
//        Stream<employee> stream2 = list.stream();
//        stream2.filter(e-> e.gender.equals("Female")).forEach(m-> System.out.println(m.name + " ----> Female"));


        Map<String, List<employee>> collect = list.stream().collect(Collectors.groupingBy(e -> e.gender));


    }
}
