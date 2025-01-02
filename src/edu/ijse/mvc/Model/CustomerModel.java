/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Model;
import java.sql.ResultSet;
import edu.ijse.mvc.dto.Customerdto;  
import edu.ijse.mvc.db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author User
 */
public class CustomerModel {
    public Customerdto searchCustomer(String id) throws Exception{
        String sql = "SELECT * FROM customer WHERE CustID=?";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,id);
        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            return new Customerdto(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"), 
                    rst.getString("PostalCode"));
        }
        return null;
        
        
        
    
    }
    
}
