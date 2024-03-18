package test.connectionPooling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getConnection {

    public static void main(String[] args) throws SQLException {
        System.out.println("start");
        Connection con = AdvanceConnectionFactory.getConnection();

        System.out.println(con);
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from bookstore");

        while(rs.next()){
            System.out.print(rs.getInt(1) + "\t");
            System.out.print(rs.getString(2)+ "\t");
            System.out.println(rs.getInt(3)+ "\t");
        }

    }
}
