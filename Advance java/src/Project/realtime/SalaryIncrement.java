



package Project.realtime;

import java.sql.*;
import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        EnterIncreement();


    }

    static void EnterIncreement() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for salary increment for all the Employees");
        int read = sc.nextInt();

        AllEmpFetch(read);


    }



    static void AllEmpFetch(int value) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Employees";
        String uname = "root";
        String pwd = "Deepak@12345";
        StringBuilder Query = new StringBuilder("select * from Employees");

        Connection con = DriverManager.getConnection(url , uname , pwd);

                PreparedStatement pstmt =  con.prepareStatement(String.valueOf(Query));

               ResultSet rs= pstmt.executeQuery();

               int count = 0;
               int []arr = new int[10];

               int salary;
               while(rs.next()){
                   System.out.println(rs.getInt(1)+ "  " + rs.getString(2 )+ "        "+ rs.getInt(3));

                   int incrementedSal;
                   salary = rs.getInt(3);
                  // System.out.println("before Increment --  "+salary);
                   salary += (salary * value) / 100;
                 //  System.out.println("After Increment --  " +salary);
                  // System.out.println();

                   arr[count] = salary;
                   count++;

               }


               con.close();

                updateSalary( value , arr);

    }



    static void updateSalary(int number , int arr[]) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Employees";
        String uname = "root";
        String pwd = "Deepak@12345";


//        for (int x:arr){
//            System.out.println(x);
//        }


            int count = 1;

        Connection con = DriverManager.getConnection(url , uname , pwd);

        for (int i = 0; i < arr.length; i++) {
            StringBuilder updateQuery = new StringBuilder("UPDATE employees SET emp_salary = ? WHERE Emp_id = ?");
            PreparedStatement pstmt =  con.prepareStatement(String.valueOf(updateQuery));

            pstmt.setInt(1 , arr[i]);
            pstmt.setInt(2 , count);

            int rows= pstmt.executeUpdate();

            count++;
        }

        StringBuilder Query = new StringBuilder("select * from Employees");



        PreparedStatement pstmt =  con.prepareStatement(String.valueOf(Query));

        ResultSet rs= pstmt.executeQuery();
        System.out.println();
        System.out.println("==========================");
        System.out.println();
        while(rs.next()){
            System.out.println(rs.getInt(1)+ "  " + rs.getString(2 )+ "        "+ rs.getInt(3));
           // System.out.println();
        }



        con.close();

    }
}
