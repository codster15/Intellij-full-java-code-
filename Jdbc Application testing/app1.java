import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class app1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/FrontEndBookStore";
        String uname = "root";
        String pwd = "Deepak@12345";
        int bookId = 101;
        String bookName = "Data Science";
        int bookPrice = 2300;



        Connection con = DriverManager.getConnection(url, uname, pwd);
        PreparedStatement pstmt = con.prepareStatement("insert into UIBookCentre values(? ,? ,? )");

        pstmt.setInt(1, bookId);
        pstmt.setString(2, bookName);
        pstmt.setInt(3, bookPrice);

        int rows = pstmt.executeUpdate();
        System.out.println(rows + " ----------------------------- ");
        con.close();
    }
}
