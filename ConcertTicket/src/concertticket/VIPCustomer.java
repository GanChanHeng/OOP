/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

/**
 *
 * @author User
 */
public class VIPCustomer extends Customer{
    private final double discountRate = 0.95;

    public VIPCustomer() {
    }

    public VIPCustomer(String Name, int phoneNo) {
        super(Name, phoneNo);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    
    
    

    

    
    
    
}
