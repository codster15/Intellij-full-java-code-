import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/BookData_Servlet")
public class BookData_Servlet extends HttpServlet  {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String price = req.getParameter("price");



        //data Inserting
            BookTableDao BTD = new BookTableDao();
        PrintWriter writer = resp.getWriter();

            try{
                BTD.DatabaseOperation(id ,name ,price);
                writer.append("<h1> Communication Successfull --> DATA captured  And inserted into dataBase</h1>");
            }catch(Exception e){

                 e.printStackTrace();

                writer.append("<h1> Communication Sucessfull -->BUT -->   DATA Not Inserted into DATABASE </h1>");
            }



    }  
}
