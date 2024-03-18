package com.deepak.servlet;

import com.deepak.DAO.SubmitToDb;
import com.deepak.DTO.EmployeeDTO;
import com.deepak.DTO.VewEmoDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/viewRecords")
public class viewRecordsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String department = req.getParameter("Department");

        String experience = req.getParameter("Experience");

        String gender = req.getParameter("gender");

        VewEmoDto ved = new VewEmoDto();




        ved.setDepartment(department);
        ved.setExperience(experience);
        ved.setGender(gender);




        SubmitToDb std = new SubmitToDb();
        try{
            List<EmployeeDTO> employeeDTOS = std.viewRecords(ved);

            req.setAttribute("employeeDTOS" , employeeDTOS);

            req.getRequestDispatcher("/ShowRecords.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
        }




    }


}
