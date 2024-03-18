package com.deepak.ConnectionFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    static   HikariDataSource hds = null;

   public Connection getConnection() throws IOException, SQLException {

    if(hds == null){
        File f = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\New pro Requirement\\Employee\\src\\db_config.properties");

        FileInputStream fis = new FileInputStream(f);

        Properties p = new Properties();
        p.load(fis);

        String url = p.getProperty("DB_url");
        String dbName = p.getProperty("DB_name");
        String db_pwd = p.getProperty("DB_pwd");

        HikariConfig hc = new HikariConfig();
        hc.setJdbcUrl(url);
        hc.setUsername(dbName);
        hc.setPassword(db_pwd);
        hc.setMaximumPoolSize(20);


        hds = new HikariDataSource(hc);
    }

       Connection con = hds.getConnection();
       return con;
    }


}
