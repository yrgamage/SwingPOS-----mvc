/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author User
 */
public class OrderDetaildto {
     private String orderId;
    private String itemCode;
    private int qty;
    private double discount;

    public OrderDetaildto() {
    }

    
    public OrderDetaildto(String orderId, String itemCode, int qty, double discount) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.discount = discount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getQty() {
        return qty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetaildto{" + "orderId=" + orderId + ", itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
    
    
}
