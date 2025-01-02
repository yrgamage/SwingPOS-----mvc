/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DbConnection;
import edu.ijse.mvc.Model.CustomerModel;
import edu.ijse.mvc.View.ItemView;
import edu.ijse.mvc.View.OrderForm;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            //new ItemView().setVisible(true);
//            System.out.println(new CustomerModel().searchCustomer("C001"));
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
new OrderForm().setVisible(true);
             
    }
    
}
