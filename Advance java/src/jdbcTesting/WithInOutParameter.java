

package jdbcTesting;

import java.sql.*;
import java.util.Scanner;

public class WithInOutParameter {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/bookstore";
        String uname = "root";
        String pwd = "Deepak@12345";
        String query = " call fetchbookPrice(? , ?);";

        System.out.println("Enter book Price");
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();

        Connection con = DriverManager.getConnection(url, uname, pwd);

        CallableStatement call = con.prepareCall(query);

        call.setInt(1 , read);
        call.registerOutParameter(2, Types.VARCHAR);


        ResultSet rs = call.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        con.close();

        System.out.println("Success");

    }
}
