/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
/**
 *
 * @author USER
 */
public class Renter implements Serializable {
       private static final long serialVersionUID = 1L;

    private String customerName;
    private String customerAddress;
    private int customerCottage;
    private String cottageSize;
    private int cottagePrice;
    private String status;
    
public Renter(String customerName, String customerAddress,
                  int customerCottage, String cottageSize,
                  int cottagePrice, String status) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerCottage = customerCottage;
        this.cottageSize = cottageSize;
        this.cottagePrice = cottagePrice;
        this.status = status;
    }

 public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getCustomerCottage() {
        return customerCottage;
    }

    public String getCottageSize() {
        return cottageSize;
    }

    public int getCottagePrice() {
        return cottagePrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalPrice() {
         return cottagePrice;
    }
    
    
}
