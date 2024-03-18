import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;
import java.util.stream.Stream;

@WebServlet("/Msg")
public class Msg extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        System.out.println();
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String format = localTime.format(dateTimeFormatter);




        System.out.println(format);

        System.out.println(format.trim().length());

        if(format.charAt(9) == 'p' ){

                    if(format.charAt(1) >0 || format.charAt(1) <= 4 ){

                        writer.append( "<h1>Good After noon EveryOne</h1>");

                    } else if(format.charAt(1) > 4 || format.charAt(1) <= 8 ){

                         writer.append( "<h1>Good Evening EveryOne</h1>");

                     }

        }else{
            System.out.println("PM Format");

        }




    }







}
