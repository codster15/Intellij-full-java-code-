package feb7;

import java.sql.*;

public class ProgramResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

         String url = "jdbc:mysql://localhost:3306/advjdb";
         String uname = "root";
         String pwd = "Deepak@12345";
         String update = "select * from books";

         //Add class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //do connection
      Connection con = DriverManager.getConnection(url, uname,pwd);

       Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_UPDATABLE);
           ResultSet rs =  stmt.executeQuery(update);

//        int count = 1;
//           while(count < 6){
//               rs.absolute(count);
//               count++;
//               System.out.println(rs.getInt(1) + "---" + rs.getString(2) + "---" + rs.getString(3) );
//           }

           rs.absolute(5);
           rs.updateString("BOOK_NAME" , "CODSTERS");
           rs.updateRow();

          rs.close();
    }

}

