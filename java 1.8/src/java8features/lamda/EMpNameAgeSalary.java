package java8features.lamda;

import java.util.Arrays;
import java.util.List;

public class EMpNameAgeSalary {

    public static void main(String[] args) {
        EmployeeData e1 = new EmployeeData("Ashok" , 30 , 150000.00);
        EmployeeData e2 = new EmployeeData("John" , 20 , 25000.00);
        EmployeeData e3 = new EmployeeData("Milli" , 28 , 45000.00);
        EmployeeData e4 = new EmployeeData("Alex" , 34 , 120000.00);
        EmployeeData e5 = new EmployeeData("Bheem" , 60 , 250000.00);


        List<EmployeeData> emp = Arrays.asList(e1 ,e2, e3 , e4, e5);

        emp.stream().filter( empData-> empData.salary >= 50000.00).
                forEach(empData-> System.out.println(empData.name +"\t" + empData.age));


    }

}

class EmployeeData{
    String name;
    int age;
    Double salary;

    EmployeeData(String name , int age , Double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

//    @Override
//    public String toString() {
//        return "name - "+ name +"    age - "+ age + "      salary " + salary;
//    }
}
