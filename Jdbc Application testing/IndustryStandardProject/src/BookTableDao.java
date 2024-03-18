import java.sql.*;

public class BookTableDao {

    void DatabaseOperation (String id , String name ,String price) throws SQLException, ClassNotFoundException {

            String  url = "jdbc:mysql://localhost:3306/FrontEndBookStore";
            String uname = "root";
            String pwd = "Deepak@12345";

            String Sqlurl = "insert into UIBookCentre values (?,?,?)";

            Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, uname, pwd);

        PreparedStatement pstmt = con.prepareStatement(Sqlurl);

        pstmt.setInt(1 , Integer.parseInt(id));
        pstmt.setString(2 , name);
        pstmt.setInt(3 , Integer.parseInt(price));

        int count = pstmt.executeUpdate();

        System.out.println(count + " Data Inserted");


        con.close();


    }

//    static void print() throws SQLException {
//        String  url = "jdbc:mysql://localhost:3306/FrontEndBookStore";
//        String uname = "root";
//        String pwd = "Deepak@12345";
//
//        String Sqlurl = "select * from UIBookCentre ";
//
//        Connection con = DriverManager.getConnection(url, uname, pwd);
//
//        Statement stmt = con.createStatement();
//
//        ResultSet rs = stmt.executeQuery(Sqlurl);
//
//
//        while(rs.next()){
//            System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3));
//
//        }
//
//        con.close();
//
//
//    }
//
//    public static void main(String[] args) throws SQLException {
//        print();
//    }

}
