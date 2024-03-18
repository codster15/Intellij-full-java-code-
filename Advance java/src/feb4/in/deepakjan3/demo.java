package feb4.in.deepakjan3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
    public static final String sql_url  = "jdbc:mysql://localhost:3306/advjdb";
    public static final String sql_uname  = "root";
    public static final String sql_upwd  = "Deepak@12345";
   // public static final String sql_update  = "INSERT INTO BOOKS VALUES(102 , 'WEBDEV', 5000)";
   //public static final String sql_update  = "delete from books where BOOK_ID = 103";
   public static final String Insert_sql = " INSERT INTO BOOKS VALUES(103, 'KUBARNATIES', 1700)";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(sql_url , sql_uname ,sql_upwd);
        System.out.println(con);

        Statement stmt = con.createStatement();

        int rows = stmt.executeUpdate(Insert_sql);
        System.out.println( " rows - "+ rows);
        con.close();


    }
}
