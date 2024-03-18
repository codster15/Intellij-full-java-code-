

package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class batchUsingPrepareStatement {

    public static <arr> void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bookstore";
        String uname = "root";
        String pwd = "Deepak@12345";
        String query = " insert into bookstore values( ? , ? , ? )";

        Connection con = DriverManager.getConnection(url, uname, pwd);

        PreparedStatement pstmt = con.prepareStatement(query);


        pstmt.setInt(1,14);
        pstmt.setString(2,"js");
        pstmt.setInt(3,500);
        pstmt.addBatch();



        pstmt.setInt(1,15);
        pstmt.setString(2,"css");
        pstmt.setInt(3,400);
        pstmt.addBatch();


        pstmt.setInt(1,16);
        pstmt.setString(2,"html");
        pstmt.setInt(3,300);
        pstmt.addBatch();

        int[] ints = pstmt.executeBatch();

        for (int x : ints){
            System.out.println(x);
        }

        con.close();
        System.out.println("executed");
    }
}
