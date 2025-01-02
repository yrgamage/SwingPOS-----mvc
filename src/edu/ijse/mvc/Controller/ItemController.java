/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;
import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.Model.ItemModel;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class ItemController {
    private ItemModel itemModel = new ItemModel();
    
    public String saveItem(ItemDto itemDto) throws Exception{
        String resp = itemModel.saveItem(itemDto);
        return resp;
    }
    
    public ArrayList<ItemDto> getAll() throws Exception{
        ArrayList<ItemDto> itemDtos = itemModel.getAll();
        return itemDtos;
    }
    public String updateItem(ItemDto itemDto) throws Exception{
        String resp = itemModel.updateItem(itemDto);
        return resp;
    }
    public ItemDto searchItem(String itemCode) throws Exception{
        return itemModel.searchItem(itemCode);
    }
    
}
