package in.deepak.servlet;

import in.deepak.dao.UserDao;
import in.deepak.dto.LoginDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


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


        try{
            boolean check = ud.GetEmailPwd(logindto);

            if(check){
               resp.sendRedirect("/Registration_Login_Project/Welcome.html");
            }else {
                resp.sendRedirect("/Registration_Login_Project/FailedLogin.html");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
