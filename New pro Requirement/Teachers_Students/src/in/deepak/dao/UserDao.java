package in.deepak.dao;

import in.deepak.dto.CollectUserDataDTO;
import in.deepak.dto.LoginDto;
import in.deepak.util.ConnectionFactory;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserDao {



//==================================================================================================================================================================




    // to send the Data for registration
    public boolean EnterDataintoDB ( CollectUserDataDTO cud ) throws ClassNotFoundException, SQLException, IOException {

        String Query = "INSERT INTO teacher_student (first_name, last_name, email, user_password, gender, select_role) VALUES (?, ?, ?, ?, ?, ?)";


        Class.forName("com.mysql.cj.jdbc.Driver");

        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();

        PreparedStatement pstmt = con.prepareStatement(Query);

        pstmt.setString(1 , cud.fname());
        pstmt.setString(2 , cud.lname());
        pstmt.setString(3 , cud.email());
        pstmt.setString(4 , cud.pwd());
        pstmt.setString(5 , cud.gender());
        pstmt.setString(6 ,cud.role());

        int count = pstmt.executeUpdate();

        return count > 0;
    }





//    ====================================================================================================================================================================


    // to Retrieve the Data from DB  for login verification
    public String GetEmailPwd (LoginDto logindto) throws ClassNotFoundException, SQLException, IOException {
        String sql = "select * from teacher_student";
        Class.forName("com.mysql.cj.jdbc.Driver");

        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            if(rs.getString(4).equals(logindto.email()) && rs.getString(5).equals(logindto.password()) )   {



                return rs.getString(7);

            }
        }

            return "Failed Retrieve";

    }



    //=========================================================================================================================================================


    // view all records

    public   List<CollectUserDataDTO> viewRecords () throws ClassNotFoundException, SQLException, IOException {

        String sql = "select * from teacher_student";
        Class.forName("com.mysql.cj.jdbc.Driver");




        List<CollectUserDataDTO> users = new ArrayList<>();



        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            CollectUserDataDTO cud = new CollectUserDataDTO();

                cud.setuID(rs.getInt(1));
                cud.setFname(rs.getString(2));
                cud.setLname(rs.getString(3));
                cud.setEmail(rs.getString(4));
                cud.setPwd(rs.getString(5));
                cud.setGender(rs.getString(6));
                cud.setRole(rs.getString(7));

            users.add(cud);



        }

        return users;
    }

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        UserDao ud = new UserDao();
        List<CollectUserDataDTO> collectUserDataDTOS = ud.viewRecords();
        collectUserDataDTOS.stream().forEach(e-> System.out.println(e));
    }


}






















