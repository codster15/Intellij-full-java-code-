
// batch using statement

package Assignment;

import java.sql.*;

public class batchUsingStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/bookstore";
        String uname = "root";
        String pwd = "Deepak@12345";
        String query = " insert into bookstore values( ? , ? , ? )";

        Connection con = DriverManager.getConnection(url, uname, pwd);

        Statement stmt = con.createStatement();

        stmt.addBatch("insert into bookstore values (11, 'ai' , 2100)");
        stmt.addBatch("insert into bookstore values (12, 'ml' , 3100)");
        stmt.addBatch("insert into bookstore values (13, 'ds' , 4100)");

        for (int i : stmt.executeBatch()) {
            System.out.println(i);
        }

        con.close();


    }

}
