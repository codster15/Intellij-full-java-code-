package com.Deepak;


import java.util.stream.Stream;

// print emp name with age whose salary is greater then 50000 using stream api
class employee{
    String name ;
    int age ;
    double salary;

    employee(String name , int age ,double salary){
        this.name = name ;
        this.age = age ;
        this.salary = salary;

    }
}
public class program4 {

    public static void main(String[] args) {
        employee emp1 = new employee("amit" ,21,64000.00);
        employee emp2 = new employee("John" ,11,48000.00);
        employee emp3 = new employee("Kamal" ,31,14000.00);
        employee emp4 = new employee("Teena" ,27,39000.00);
        employee emp5 = new employee("Julia" ,49,81000.00);

        Stream<employee> str = Stream.of(emp1,emp2,emp3,emp4,emp5);

        str
                .filter(e-> e.salary < 50000)
                .forEach(employee -> System.out.println(employee.name +" -- " + employee.age + " -- "+ employee.salary) );
    }


}
