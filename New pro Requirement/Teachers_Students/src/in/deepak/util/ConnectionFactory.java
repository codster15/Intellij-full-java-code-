package in.deepak.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    // Static variable to hold the HikariDataSource instance
    // This ensures that we use a single instance (singleton pattern) throughout the application.
    static  HikariDataSource source = null;

    // Static method to obtain a database connection
    // Throws IOException if there's an issue reading the properties file
    // Throws SQLException if there's an issue obtaining the connection from the data source
    public Connection getConnection() throws IOException, SQLException {


        if(source == null){
            // Specifies the path to the properties file that contains database configuration
            File file = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\New pro Requirement\\Teachers_Students\\src\\DB_config.properties");

            // Opens a FileInputStream to read from the specified file
            FileInputStream fis = new FileInputStream(file);

            // Creates a Properties object to load the database configuration
            Properties p = new Properties();
            // Loads properties from the FileInputStream
            p.load(fis);

            // Retrieves the database URL, username, and password from the properties file
            String url = p.getProperty("DB_url");
            String dbName = p.getProperty("DB_name");
            String db_pwd = p.getProperty("DB_pwd");

            // Creates a new HikariConfig object to configure the HikariDataSource
            HikariConfig  config = new HikariConfig();
            // Sets the JDBC URL for the database
            config.setJdbcUrl(url);
            // Sets the database username
            config.setUsername(dbName);
            // Sets the database password
            config.setPassword(db_pwd);

            // Initializes the HikariDataSource with the configuration
            source = new HikariDataSource(config);
        }


        // Obtains a connection from the data source
        Connection con =  source.getConnection();

        // Returns the obtained connection
        return con;
    }
}










//package in.deepak.util;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.Properties;
//
//public class ConnectionFactory {
//
//    static  HikariDataSource source = null;
//
//   static Connection getConnection() throws IOException, SQLException {
//
//       //file path
//       File file = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\REGISTRATION_AND_LOGIN_PROJECT\\Registration_Login_Project\\src\\DB_config.properties");
//
//       // to read db file data
//       FileInputStream fis = new FileInputStream(file);
//
//       // file class creation and loading using load method
//       Properties p = new Properties();
//       p.load(fis);
//
//       String url = p.getProperty("DB_url");
//       String dbName = p.getProperty("DB_name");
//       String db_pwd = p.getProperty("DB_pwd");
//
//       HikariConfig  config = new HikariConfig();
//       config.setJdbcUrl(url);
//       config.setUsername(dbName);
//       config.setPassword(db_pwd);
//
//       source = new HikariDataSource(config);
//
//       Connection con =  source.getConnection();
//
//       return con;
//   }
//
//
//
//
//
//}
