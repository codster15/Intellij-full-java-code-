

package jdbcTesting;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class InsertImage {
    public static void main(String[] args) throws IOException, SQLException {
        //file loaded
        File f = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\Advance java\\src\\User_db.properties");
        //file data read
        FileInputStream fis = new FileInputStream(f);

        //creating Properties Object and loading the files
        Properties p = new Properties();
        p.load(fis);


        //loading details from db_FIle
        String url = p.getProperty("url");
        String uname = p.getProperty("uname");
        String pwd = p.getProperty("pwd");


        //retreving connection details
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(uname);
        config.setPassword(pwd);


        String sql_Query  = "insert into Person values(? , ?)";
       // String Img = "H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\Advance java\\src\\boy1.jpeg";

        File fImageLoc = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\Advance java\\src\\boy1.jpeg");
        FileInputStream fis_Img = new FileInputStream(fImageLoc);



        HikariDataSource hds = new HikariDataSource(config);
        Connection con = hds.getConnection();

        PreparedStatement ps = con.prepareStatement(sql_Query);

        ps.setInt(1 , 101);

        //set blob  is important
        ps.setBlob(2 , fis_Img);
        int count = ps.executeUpdate();

        System.out.println(count);

        con.close();

    }
}
