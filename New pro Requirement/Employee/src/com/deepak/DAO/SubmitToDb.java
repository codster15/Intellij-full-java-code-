package com.deepak.DAO;

import com.deepak.ConnectionFactory.ConnectionFactory;
import com.deepak.DTO.EmployeeDTO;
import com.deepak.DTO.VewEmoDto;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubmitToDb {


    //  this file is inserting data which captured by Servlet and then inserting into Data Base


    public boolean insertDataInDb(EmployeeDTO ED) throws SQLException, IOException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String Query = "insert into Employees (Name , Email,Gender , Department , Experience) values (?,?,?,?,?)";



        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();

        PreparedStatement pstmt = con.prepareStatement(Query);

        pstmt.setString(1 , ED.name() );
        pstmt.setString(2 , ED.Email() );
        pstmt.setString(3 , ED.Gender() );
        pstmt.setString(4 , ED.Department() );
        pstmt.setInt(5 , ED.Experience());


        int count = pstmt.executeUpdate();




        return count > 0;
    }










    // retrieving records from database
//====================================================================================================================================================
    public List<EmployeeDTO> viewRecords(VewEmoDto ved) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String department = ved.department();
        String experience = ved.experience();
        String gender = ved.gender();


        List<EmployeeDTO> list = new ArrayList<>();

        StringBuilder Sql_Query = new StringBuilder("SELECT * FROM Employees WHERE 1=1");
        if (!"select".equals(department)) {
            Sql_Query.append(" AND Department = '").append(department).append("'");
        }

        if (!"select".equals(experience)) {
            Sql_Query.append(" AND Experience = '").append(experience).append("'");
        }

        if (!"select".equals(gender)) {
            Sql_Query.append(" AND Gender = '").append(gender).append("'");
        }

        String newQuery = Sql_Query.toString();

        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(newQuery);


        while(rs.next()){
            EmployeeDTO data = new EmployeeDTO();

            data.setName(rs.getString(2));
            data.setEmail(rs.getString(3));
            data.setGender(rs.getString(4));
            data.setDepartment(rs.getString(5));
            data.setExperience(rs.getInt(6));

            list.add(data);
        }

       return list;
    }



}
