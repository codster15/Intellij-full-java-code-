package jdbcTesting;


import java.sql.*;

public class callableFunction {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/Employees";
        String uname = "root";
        String pwd = "Deepak@12345";
        String query = "call getEmpsData()";



        Connection con = DriverManager.getConnection(url , uname , pwd);

        CallableStatement call = con.prepareCall(query);

        ResultSet resultSet = call.executeQuery();

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " -- " + resultSet.getString(2) + "---" + resultSet.getInt(3) );

        }
        con.close();


    }
}
