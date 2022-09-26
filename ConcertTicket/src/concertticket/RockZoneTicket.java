/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

/**
 *
 * @author User
 */
public class RockZoneTicket extends Ticket{
    
    public RockZoneTicket() {
    }

    public RockZoneTicket(int price, concertticket.ticketInfo ticketInfo, int availableTicket) {
        super(price, ticketInfo, availableTicket);
        setDistFromStage("Close");
    }

    @Override
    public String toString() {
        return "--Rock Zone Area(Standing Zone)--"
                + "\nAvailable Seat: " + getAvailableTicket()
                +"\nPrice of this area: " + getPrice()
                + "\nDistance from stage: "+ getDistFromStage()+"\n";
    }

    
   
}
