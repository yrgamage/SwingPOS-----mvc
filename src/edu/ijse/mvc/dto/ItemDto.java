/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;


/**
 *
 * @author User
 */
public class ItemDto {
    private String itemCode;
    private String itemDescription;
    private String packSize;
    private double unitPrice;
    private int qoh;

    public ItemDto() {
    }
    
    
    public ItemDto(String itemCode,String itemDescription,String pacKSize,double unitPrice,int qoh){
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getPackSize() {
        return packSize;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }
    

    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + itemCode + ", itemDescription=" + itemDescription + ", packSize=" + packSize + ", unitPrice=" + unitPrice + '}';
    }
    
    
}
