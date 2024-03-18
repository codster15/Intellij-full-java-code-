import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class ServletTestingApp extends HttpServlet {



      public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.append("<h1> welcome to servlet </h1>");


    }

}
