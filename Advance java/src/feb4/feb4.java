package feb4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class feb4 {
            public static final String url = "jdbc:mysql://localhost:3306/advjdb";
            public static final String uname = "root";
            public static final String pwd = "Deepak@12345";
            public static final String update = "INSERT INTO BOOKS VALUES ( 104 , 'DATA SCIENCE' ,3000)";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");                               //step 1

           Connection con  =  DriverManager.getConnection(url ,uname, pwd);             //step 2
                 System.out.println(con);

                     Statement stmt  = con.createStatement();

                    int rowsEffect  =  stmt.executeUpdate(update);
                         System.out.println(rowsEffect);

                         con.close();



    }

}
