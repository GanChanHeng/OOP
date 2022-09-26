/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

/**
 *
 * @author User
 */
public class NormalZoneTicket extends Ticket{
    private int[] seatNo ;

    public NormalZoneTicket() {
    }

    public NormalZoneTicket( int price, concertticket.ticketInfo ticketInfo, int availableTicket) {
        super(price, ticketInfo, availableTicket);
        setDistFromStage("Far");
    }

    @Override
    public String toString() {
        return "--Normal Zone Area--"
                + "\nAvailable Seat: " + getAvailableTicket()
                +"\nPrice of this area: " + getPrice()
                + "\nDistance from stage: "+ getDistFromStage()+"\n";
    }

    
    
}
