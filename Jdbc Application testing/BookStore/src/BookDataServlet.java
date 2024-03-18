import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/BookDataServlet")
public class BookDataServlet extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String bookId = req.getParameter("id");
        String bookName = req.getParameter("name");
        String bookPrice = req.getParameter("price");

         System.out.println(bookId);
         System.out.println(bookName);
         System.out.println(bookPrice);




         PrintWriter writer = resp.getWriter();

        try{

            String url = "jdbc:mysql://localhost:3306/FrontEndBookStore";
            String uname = "root";
            String pwd = "Deepak@12345";


            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, uname, pwd);
            PreparedStatement pstmt = con.prepareStatement("insert into UIBookCentre values(? ,? ,? )");

            pstmt.setInt(1, Integer.parseInt(bookId));
            pstmt.setString(2, bookName);
            pstmt.setInt(3, Integer.parseInt(bookPrice));

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " ----------------------------- ");
            con.close();



        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e + "----------------");
        }
        writer.append("<h1> Data Got Inserted </h1>");

    }












}




