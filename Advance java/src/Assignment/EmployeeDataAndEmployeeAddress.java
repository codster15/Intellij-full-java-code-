

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDataAndEmployeeAddress {

    public static void main(String[] args) throws SQLException {
//
//        System.out.println(" -------   WELCOME    --------");
//        System.out.println();
//        System.out.println();
//
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("type 'ED' for employee data Insertion   or   type 'AD' for employee Address Insertion");
//        String data = sc.next();
//
//
//
//        if(data.equals("ED")){
//          EmpData();
//        }else if(data.equals("AD")){
//            EmpAdd();
//        }else{
//            System.out.println("Incorrect Type");
//
//        }
        EmpAdd();


    }
    static void EmpData() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/human";
        String uname = "root";
        String pwd = "Deepak@12345";
        String query = "insert into employeeData values ( ? , ? ,  ? )";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID");
        int id = sc.nextInt();

        System.out.println("Enter Employee Name");
        String name = sc.next();

        System.out.println("Enter Employee Salary");
        int salary = sc.nextInt();

        Connection con = DriverManager.getConnection(url, uname, pwd);

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1 , id);
        ps.setString(2 , name);
        ps.setInt(3, salary);

        int rows = ps.executeUpdate();

        con.close();

    }
    static void EmpAdd() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/human";
        String uname = "root";
        String pwd = "Deepak@12345";
        String query = "insert into employeeAddress values ( ? , ? ,  ? ,?  )";

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr id");
        int id = sc.nextInt();


        System.out.println("Enter Employee city");
       String city = sc.next();

        System.out.println("Enter Employee State");
        String state = sc.next();

        System.out.println("Enter Employee Country");
        String Country = sc.next();

        Connection con = DriverManager.getConnection(url, uname, pwd);

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1 , city);
        ps.setString(2 , state);
        ps.setString(3, Country);
        ps.setInt(4, id);



        int rows = ps.executeUpdate();

        con.close();

        System.out.println("Data got inserted");
    }
}
