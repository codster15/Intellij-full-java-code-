package jdbcTesting;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDemo {
    public static void main(String[] args) {
        ArrayList<employee> al = new ArrayList<>();
        al.add(new employee(3 ,"miller" , 50000));
        al.add(new employee(7 ,"david" , 20000));
        al.add(new employee(2 ,"anderson" , 90000));
        al.add(new employee(9 ,"collingwood" , 70000));
        al.add(new employee(1 ,"zar" , 10000));

        Collections.sort(al , new EmpIDComparator());


        System.out.println("Based on ID =========");

        for (employee emp : al){
            System.out.println(emp);
        }
        System.out.println();
        Collections.sort(al ,new EmpnameComparator());

        System.out.println("Based on Name =========");
        for (employee emp : al){
            System.out.println(emp);
        }

        System.out.println();

        Collections.sort(al , new EmpSalaryComparator());
        System.out.println("Based on Salary =========");
        for (employee emp : al){
            System.out.println(emp);
        }

    }


}
