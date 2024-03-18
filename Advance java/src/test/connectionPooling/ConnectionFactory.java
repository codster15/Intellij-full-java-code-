


package test.connectionPooling;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/bookstore";
        String uname = "root";
        String pwd = "Deepak@12345";

//        System.out.println("testing first details");
//        System.out.println(url);
//        System.out.println(uname);
//        System.out.println(pwd);

        File f = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\Advance java\\src\\test\\connectionPooling\\DB.properties");


        // Create a FileInputStream to read from the "DB.properties" file.
        FileInputStream fis = new FileInputStream(f);

        // Create a Properties object to load key-value pairs from the file.
        Properties p = new Properties();
       p.load(fis); // Load properties from the file input stream.

        // Retrieve database connection details from the loaded properties.
        String db_url = p.getProperty("db.url");
        String db_uname = p.getProperty("db.uname");
        String db_pwd = p.getProperty("db.pwd");

       // String db_poolSize = p.getProperty("db.poolSize");

        // Creating HikariConfig object and configuring it
        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl(url);
//        config.setUsername(uname);
//        config.setPassword(pwd);
        config.setJdbcUrl(db_url);
        config.setUsername(db_uname);
        config.setPassword(db_pwd);




//        System.out.println();
//        System.out.println("testing 2nd details");
//        System.out.println(db_url);
//        System.out.println(db_uname);
//        System.out.println(db_pwd);
//        config.setMaximumPoolSize(20);
//        config.setMinimumIdle(5);

// Creating HikariDataSource object using the configured HikariConfig
        HikariDataSource dataSource = new HikariDataSource(config);

// Getting a connection from the connection pool
        Connection con = dataSource.getConnection();

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from bookstore");


        while(rs.next()){
            System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3));
        }
        con.close();

    }

}
