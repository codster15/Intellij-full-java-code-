package com.deepu.empDAO;

import com.deepu.entity.EmployeeEntity;

import java.util.List;

public interface EmpDAO {

    EmployeeEntity FetchByID (int id);
    List<EmployeeEntity> FetchEmployee();

    List<Object[]> FetchByNameAndSalary ();

}
