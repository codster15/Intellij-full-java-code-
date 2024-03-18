package jdbcTesting;

import java.sql.*;
import java.util.Scanner;

public class withParameter {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/bookstore";
        String uname = "root";
        String pwd = "Deepak@12345";
        String query = "call getbook(?)";

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();




        Connection con = DriverManager.getConnection(url , uname , pwd);
        CallableStatement call = con.prepareCall(query);

             call.setInt(1,read);

        ResultSet resultSet = call.executeQuery();

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + "--- " + resultSet.getString(2) + "--- " + resultSet.getInt(3));

        }
        con.close();



    }
}
