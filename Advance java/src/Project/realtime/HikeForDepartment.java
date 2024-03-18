package Project.realtime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class HikeForDepartment {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Employees";
        String uname = "root";
        String pwd = "Deepak@12345";

        Scanner sc = new Scanner(System.in);
        System.out.println("hike for admin ");
        int admin  = sc.nextInt();

        System.out.println("Security for admin ");
        int Security  = sc.nextInt();

        System.out.println("HR for admin ");
        int hr  = sc.nextInt();

        Connection con = DriverManager.getConnection(url , uname , pwd);


        if(admin != 0 ){
            String updateAdmin = "update Employees set emp_salary = emp_salary  + (emp_salary * ? / 100) where emp_dept = 'admin' ";
            PreparedStatement pstmt = con.prepareStatement(updateAdmin);
            pstmt.setInt(1 ,admin);
            pstmt.executeUpdate();
        }


        if(Security != 0 ){
            String updateSecurity = "update Employees set emp_salary = emp_salary  + (emp_salary * ? / 100) where emp_dept = 'Security'";
            PreparedStatement pstmt = con.prepareStatement(updateSecurity);
            pstmt.setInt(1 ,Security);
            pstmt.executeUpdate();
        }

        if(hr != 0 ){
            String updateHr = "update Employees set emp_salary = emp_salary  + (emp_salary * ? / 100) where emp_dept = 'hr' ";
            PreparedStatement pstmt = con.prepareStatement(updateHr);
            pstmt.setInt(1 ,hr);
            pstmt.executeUpdate();
        }

        System.out.println("executed");
        con.close();
    }
}
