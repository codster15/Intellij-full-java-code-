package com.deepu.SqLQuery;

public class SqlQuery {
    public static final String QueryByID = "from EmployeeEntity e where e.id = ?1";
    public static final String Queryemp = "from EmployeeEntity e ";
    public static final String QueryByNameSal = "select e.name , e.salary from EmployeeEntity e ";
}
