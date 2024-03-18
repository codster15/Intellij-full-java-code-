package com.deepak.servlet;

import com.deepak.DAO.SubmitToDb;
import com.deepak.DTO.EmployeeDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Submit")
public class SubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String department = req.getParameter("department");
        int experience = Integer.parseInt(req.getParameter("experience"));


        EmployeeDTO edto = new EmployeeDTO();
        edto.setName(name);
        edto.setEmail(email);
        edto.setGender(gender);
        edto.setDepartment(department);
        edto.setExperience(experience);

        PrintWriter writer = resp.getWriter();

        SubmitToDb insertdata = new SubmitToDb();

        try{
            boolean b = insertdata.insertDataInDb(edto);

            if(b){
                writer.append("<h1> Data Inserted </h1>");
            }else{
                writer.append("<h1> Data Not Inserted </h1>");
            }
        }catch(Exception e){
            System.out.println(e);
            writer.append("<h1>Database communication Failed</h1>");
        }





    }



}
