package in.deepak.dao;

import in.deepak.dto.CollectUserDataDTO;
import in.deepak.dto.LoginDto;
import in.deepak.util.ConnectionFactory;

import java.io.IOException;
import java.sql.*;


public class UserDao {



//==================================================================================================================================================================




    // to send the Data for registration
    public boolean EnterDataintoDB ( CollectUserDataDTO cud ) throws ClassNotFoundException, SQLException, IOException {

        String Query = "insert into RegisteredUser values (? , ? , ? , ? , ?)";


        Class.forName("com.mysql.cj.jdbc.Driver");

        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();

        PreparedStatement pstmt = con.prepareStatement(Query);

        pstmt.setString(1 , cud.fname());
        pstmt.setString(2 , cud.lname());
        pstmt.setString(3 , cud.email());
        pstmt.setString(4 , cud.pwd());
        pstmt.setString(5 , cud.gender());

        int count = pstmt.executeUpdate();

        return count > 0;
    }





//    ====================================================================================================================================================================


    // to Retreive the Data from DB  for login verification
    public boolean GetEmailPwd (LoginDto logindto) throws ClassNotFoundException, SQLException, IOException {
        String sql = "select * from RegisteredUser";
        Class.forName("com.mysql.cj.jdbc.Driver");

        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.getConnection();

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            if(rs.getString(3).equals(logindto.email()) && rs.getString(4).equals(logindto.password()) )   {



                return true;

            }
        }

            return false;

    }


}






















