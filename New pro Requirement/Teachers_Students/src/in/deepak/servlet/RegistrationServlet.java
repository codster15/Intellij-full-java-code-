package in.deepak.servlet;

import in.deepak.dao.UserDao;
import in.deepak.dto.CollectUserDataDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstname = req.getParameter("firstName");
        String lastname = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String userinfo = req.getParameter("userinfo");


        CollectUserDataDTO cud = new CollectUserDataDTO();
        // setting the value which collected by servlet
        cud.setFname(firstname);
        cud.setLname(lastname);
        cud.setEmail(email);
        cud.setPwd(password);
        cud.setGender(gender);
        cud.setRole(userinfo);


        // call dao method by giving Registration data
        UserDao dataInsert = new UserDao();
        boolean check = false;

        try{
             check = dataInsert.EnterDataintoDB(cud);

        }catch (Exception e){

            e.printStackTrace();
        }


        PrintWriter writer = resp.getWriter();

        // sending response to client


        if(check){
           resp.sendRedirect("/Teachers_Students/RegistrationDone.html");
        }else{
            resp.sendRedirect("/Teachers_Students/RegistrationFailed.html");
        }


    }
}
