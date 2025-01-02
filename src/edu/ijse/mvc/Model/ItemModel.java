/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Model;
import edu.ijse.mvc.db.DbConnection;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author User
 */
public class ItemModel {
    public String saveItem(ItemDto dto) throws Exception{
        String sql = "INSERT INTO Item VALUES(?,?,?,?,?)";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getItemCode());
        statement.setString(2, dto.getItemDescription());
        statement.setString(3, dto.getPackSize());
        statement.setDouble(4, dto.getUnitPrice());
        statement.setInt(5, dto.getQoh());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
        
    }
    
    public ArrayList<ItemDto> getAll() throws Exception{
        String sql = "SELECT * FROM item";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        ArrayList<ItemDto> dtos = new ArrayList<>();
        while (rst.next()) {            
            ItemDto dto = new ItemDto(rst.getString("ItemCode"),
                    rst.getString("Description"),
                    rst.getString("PackSize"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand"));
            dtos.add(dto);
        }
        return dtos;
        
    }
     public ItemDto searchItem(String itemCode) throws Exception{
        String sql = "SELECT * FROM Item WHERE ItemCode = ?";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemCode);
        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            ItemDto dto = new ItemDto(rst.getString("ItemCode"),
                    rst.getString("Description"),
                    rst.getString("PackSize"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand"));
            return dto;
        }
        return null;
    }
    
    public String updateItem(ItemDto dto) throws Exception{
        String sql = "UPDATE ITEM SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode = ?";
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getItemDescription());
        statement.setString(2, dto.getPackSize());
        statement.setDouble(3, dto.getUnitPrice());
        statement.setInt(4, dto.getQoh());
        statement.setString(5, dto.getItemCode());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
        
    }
    
    
}
