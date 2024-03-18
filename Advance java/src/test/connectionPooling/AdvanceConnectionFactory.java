package test.connectionPooling;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class AdvanceConnectionFactory {
    // Declare a static DataSource instance to be shared by all instances of this class.
    private static DataSource ds = null;



    // Static initializer block - executed once when the class is loaded.
    static {
        try {
            System.out.println("Current working directory: " + System.getProperty("user.dir"));

            // Load  "DB.properties" file.
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
            String db_poolSize = p.getProperty("db.poolSize");

            // Create a new HikariConfig object to configure the connection pool.
            HikariConfig config = new HikariConfig();

            // Set database connection details in the HikariConfig object.
            config.setJdbcUrl(db_url);
            config.setUsername(db_uname);
            config.setPassword(db_pwd);

            // Set the maximum pool size from the properties file.
         //   config.setMaximumPoolSize(Integer.parseInt(db_poolSize));

            // Initialize the static DataSource with a new HikariDataSource, passing the config.
            ds = new HikariDataSource(config);

        } catch (Exception e) {
            // Print the stack trace for any exceptions that occur.
            e.printStackTrace();
        }
    }

    // Public method to get a connection from the DataSource.
    public static Connection getConnection() throws SQLException {
        // Request and return a connection from the DataSource (connection pool).
        return ds.getConnection();
    }
}
