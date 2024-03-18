package feb4.deepak;

//CREATE TABLE BOOKS (
//BOOK_ID INT (10),
//BOOK_NAME varchar (100),
//BOOK_PRICE INT(10)
//);
//commit;

import java.sql.*;

public class InsertBook {
    public static final String db_url = "jdbc:mysql://localhost:3306/advjdb";
    public static final String db_pwd = "Deepak@12345";
    public static final String db_UNAME = "root";
   // public static final String Insert_sql = " INSERT INTO BOOKS VALUES(103, 'KUBARNATIES', 1700)";


    public static final String Insert_sql = "DELETE FROM BOOKS WHERE BOOK_ID = 102 ";


    //--------------------------------------------------------------------------------------------------------------------
            public static void main(String[] args) throws ClassNotFoundException, SQLException {

                Class.forName("com.mysql.jdbc.Driver");

               Connection con =  DriverManager.getConnection(db_url , db_UNAME ,db_pwd);
                System.out.println(con);

                Statement stmt = con.createStatement();

                int rows = stmt.executeUpdate(Insert_sql);
                System.out.println("Record inserted count :: " + rows);

                con.close();






            }


}
