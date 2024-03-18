package java8features.lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String name ;
    String location ;
    String dept ;

    Employee(String name  , String location , String dept){
        this.name = name ;
        this.location = location;
        this.dept = dept;

    }
}

public class joinPredicate {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Ashok" , "hyd" , "DB"));
        al.add(new Employee("Raju" , "Chennai" , "Devops"));
        al.add(new Employee("Rani" , "Pune" , "Networking"));
        al.add(new Employee("Ganesh" , "Delhi" , "Testing"));
        al.add(new Employee("john" , "hyd" , "DB"));

          Predicate<Employee>  predicate1 = e -> e.location.equals("hyd");
          Predicate<Employee>  predicate2 = e -> e.dept.equals("DB");

          //Joining the predicate
        Predicate<Employee> predicate = predicate1.and(predicate2);


        for (Employee emp : al){
            if(predicate.test(emp)){
                System.out.println();
                System.out.println(emp.name + " -- " + emp.location + " -- " + emp.dept);
            }



        }

    }

}
