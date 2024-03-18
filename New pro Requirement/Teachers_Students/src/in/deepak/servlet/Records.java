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
import java.util.ArrayList;
import java.util.List;


@WebServlet("/Records")
public class Records extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // servlet is calling the dao method
        UserDao ud = new UserDao();

        try{
            // dao method is returning the list of  Users
            List<CollectUserDataDTO> users = ud.viewRecords();

            // users data i m setting in request attribute
            req.setAttribute("users" , users);

            // then i m redirecting to  request from servlet to jsp
            req.getRequestDispatcher("/viewUsersTwo.jsp").forward(req,resp);

        }catch(Exception e){
            e.printStackTrace();
        }



    }

//    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
//        UserDao ud = new UserDao();
//        List<CollectUserDataDTO> users = ud.viewRecords();
//
//
//     for (CollectUserDataDTO u : users){
//         System.out.println(u.fname());
//     }
//
//
//        users.stream().forEach(e-> System.out.println(e.fname()));
//
//    }


}
