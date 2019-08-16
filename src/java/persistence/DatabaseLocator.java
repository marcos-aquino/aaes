package persistence;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ice
 */
public class DatabaseLocator {
    private static DatabaseLocator instance = new DatabaseLocator();
    public static DatabaseLocator getInstance(){
        return instance;
    }
    private DatabaseLocator(){}
    
    public Connection getConnection() throws SQLException,
            ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://172.18.10.31/marcos", "201276024", "201276024");
        return conn;
    }
}
