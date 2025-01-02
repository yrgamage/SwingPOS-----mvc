/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;
import edu.ijse.mvc.dto.Customerdto;
import edu.ijse.mvc.Model.CustomerModel;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class CustomerController {
    private CustomerModel customerModel = new CustomerModel();
    public Customerdto SearchCustomer(String id)throws Exception{
        return customerModel.searchCustomer(id);
        
    
    }
    
}
