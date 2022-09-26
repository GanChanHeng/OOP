/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

/**
 *
 * @author User
 */
public class VIPTicket extends Ticket{
    private int[] seatNo;

    public VIPTicket() {
    }


    public VIPTicket(int price, concertticket.ticketInfo ticketInfo, int availableTicket) {
        super(price, ticketInfo, availableTicket);
        setDistFromStage("Moderate");
    }
    
    @Override
    public String toString() {
        return "--VIPZone Area--"
                + "\nAvailable Seat: " + getAvailableTicket()
                +"\nPrice of this area: " + getPrice()
                + "\nDistance from stage: "+ getDistFromStage()+"\n";
    }

}
