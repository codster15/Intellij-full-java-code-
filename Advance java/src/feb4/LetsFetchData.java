
package feb4;
import java.sql.*;
public class LetsFetchData {

    public static final String url = "jdbc:mysql://localhost:3306/advjdb";
    public static final String uname = "root";
    public static final String pwd = "Deepak@12345";
    //public static final String update = "INSERT INTO BOOKS VALUES ( 104 , 'DATA SCIENCE' ,3000)";

    public static final String retival = "Select * from books ";



    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, uname, pwd);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(retival);
        System.out.println(rs);
        int count = 0;
        while (rs.next()) {
            count++;
            System.out.println();

            System.out.println("          Row - " + count);
            int id = rs.getInt("book_id");
            String name = rs.getString("book_name");
            double price = rs.getDouble("book_price");

            System.out.println(id);
            System.out.println(name);
            System.out.println(price);

            System.out.println("--------------------");
        }
            con.close();


    }

}