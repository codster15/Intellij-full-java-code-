package in.deepak.servlet;

import in.deepak.dao.UserDao;
import in.deepak.dto.CollectUserDataDTO;
import in.deepak.dto.LoginDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // collecting data from UI
        String email = req.getParameter("email");
        String password = req.getParameter("password");




        // setting the value for getter setter
        LoginDto logindto = new LoginDto();
        logindto.setEmail(email);
        logindto.setPassword(password);



        UserDao ud = new UserDao();

        try {
            List<CollectUserDataDTO> UserData = ud.viewRecords();
             for (CollectUserDataDTO x : UserData){
                 System.out.println(x);
             }

        }catch(Exception e){
            e.printStackTrace();
        }


        try{
            String check = ud.GetEmailPwd(logindto);

            if(check.equals("Teacher")){
                resp.sendRedirect("/Teachers_Students/Teacher_dashBoard.html");
            }else if (check.equals("Student")) {

                resp.sendRedirect("/Teachers_Students/Student_dashboard.html");
            }else {
                resp.sendRedirect("/Teachers_Students/FailedLogin.html");
            }


        }catch (Exception e){
            e.printStackTrace();
            resp.sendRedirect("/Teachers_Students/FailedLogin.html");
        }

    }
}
