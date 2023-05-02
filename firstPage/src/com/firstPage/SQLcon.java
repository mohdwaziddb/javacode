package com.firstPage;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLcon {

    public Connection mySqlconnetion(){
        Connection connect = null;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url ="jdbc:mysql://localhost:3306/demo";
            String username = "root";
            String password = "root";
            connect = DriverManager.getConnection(url, username, password);
            //System.out.println("Connection Established successfully");

        }catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getStackTrace());

        }
        return connect;
    }
}
