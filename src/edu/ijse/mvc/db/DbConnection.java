/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @Yoshani User
 */
public class DbConnection {
    private static DbConnection dbConnection;
    private Connection connection;
    
    private DbConnection() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","yoshani#28");
    
    } 
    

    
    public static DbConnection getInstance() throws SQLException,ClassNotFoundException{
        if(dbConnection==null){
            dbConnection = new DbConnection();
            
        }return dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
