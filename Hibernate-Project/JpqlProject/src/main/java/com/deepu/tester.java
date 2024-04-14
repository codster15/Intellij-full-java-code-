package com.deepu;

import com.deepu.empDAO.EmpDAO;
import com.deepu.empDAOImpl.EmployeeDAOImpl;
import com.deepu.entity.EmployeeEntity;

import java.util.List;

public class tester {
    public static void main(String[] args) {
         EmpDAO emp = new EmployeeDAOImpl();

        EmployeeEntity employeeEntity = emp.FetchByID(9);
        System.out.println("================================================");
        System.out.println(employeeEntity);

        List<EmployeeEntity> employeeEntities = emp.FetchEmployee();

        employeeEntities.forEach(e-> System.out.println(e));
        System.out.println("================================================");


        List<Object[]> objects = emp.FetchByNameAndSalary();

        for (Object[] x : objects){
            System.out.println(x[0] + " , " + x[1]);
        }

//        objects.stream().forEach(e-> System.out.println(e[0] + " , "+  e[1]));
    }
}
