package feb4.in.deepakjan3;

import java.sql.*;

public class fetchdata {
    public static final String sql_url  = "jdbc:mysql://localhost:3306/advjdb";
    public static final String sql_uname  = "root";
    public static final String sql_upwd  = "Deepak@12345";

    public  static final String retri_veal = "SELECT * FROM BOOKS WHERE BOOK_ID = 103";


    //-----------------------------------------------------------------------


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

       Connection con =  DriverManager.getConnection(sql_url , sql_uname , sql_upwd);



        Statement stmt = con.createStatement();

      ResultSet rs = stmt.executeQuery(retri_veal);

      if(rs.next()){
          int id = rs.getInt("book_id");
          String bookName = rs.getString("book_name");
          double price = rs.getDouble("book_price");

          System.out.println(id);
          System.out.println(bookName);
          System.out.println(price);
      }else{
          System.out.println("Record not found");
      }

    }
}
