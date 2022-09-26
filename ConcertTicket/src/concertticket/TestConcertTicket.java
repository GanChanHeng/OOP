/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concertticket;

import java.util.ArrayList;
import java.util.Scanner;

public class TestConcertTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<ticketInfo> ticketInfo = new ArrayList<ticketInfo>();
        ticketInfo CaiXuKunTicketinfo = new ticketInfo("CaiXuKun","25 JUN 2023", "Arena of Stars");
        ticketInfo TwiceTicketinfo = new ticketInfo("Twice","31 JUL 2023", "Axiata Arena");
        ticketInfo JayChouTicketinfo = new ticketInfo("Jay Chou","15 JAN 2023", "Stadium Bukit Jalil");
        
        ticketInfo.add(CaiXuKunTicketinfo);
        ticketInfo.add(TwiceTicketinfo);
        ticketInfo.add(JayChouTicketinfo);
        
        
//        Ticket[] CaiXuKunConcertTicket = new Ticket[3];
//        Ticket[] TwiceConcertTicket = new Ticket[3];
//        Ticket[] JayChouConcertTicket = new Ticket[3];
//        //Assign price and avaialable seat to each concert
//        //price and seat value affected by area chosen by user
//        //Assign value to "CaiXuKun" Concert
//        CaiXuKunConcertTicket[0] = new RockZoneTicket(758, ticketInfo.get(0),200);
//        CaiXuKunConcertTicket[1] = new VIPTicket(658, ticketInfo.get(0),200);
//        CaiXuKunConcertTicket[2] = new NormalZoneTicket(558, ticketInfo.get(0),300);
//        //Assign value to "Twice" Concert
//        TwiceConcertTicket[0] = new RockZoneTicket(888, ticketInfo.get(1),300);
//        TwiceConcertTicket[1] = new VIPTicket(788, ticketInfo.get(1),300);
//        TwiceConcertTicket[2] = new NormalZoneTicket(688, ticketInfo.get(1),400);
//        //Assign value to "JayChou" Concert
//        JayChouConcertTicket[0] = new RockZoneTicket(998, ticketInfo.get(2),400);
//        JayChouConcertTicket[1] = new VIPTicket(898, ticketInfo.get(2),400);
//        JayChouConcertTicket[2] = new NormalZoneTicket(798, ticketInfo.get(2),500);
//        
        ArrayList<RockZoneTicket> RockZoneTicket = new ArrayList<RockZoneTicket>();
        ArrayList<VIPTicket> VIPTicket = new ArrayList<VIPTicket>();
        ArrayList<NormalZoneTicket> NormalZoneTicket = new ArrayList<NormalZoneTicket>();    
       
        //CaiXuKun Concert
        RockZoneTicket CaiXuKunRockZoneTicket = new RockZoneTicket(758, ticketInfo.get(0),200);
        VIPTicket CaiXuKunVIPTicket = new VIPTicket(658, ticketInfo.get(0),200);
        NormalZoneTicket CaiXuKunNormalZoneTicket = new NormalZoneTicket(558, ticketInfo.get(0),300);
        // add to array of each area
        RockZoneTicket.add(CaiXuKunRockZoneTicket);
        VIPTicket.add(CaiXuKunVIPTicket);
        NormalZoneTicket.add(CaiXuKunNormalZoneTicket);
        
        //Twice Concert
        RockZoneTicket TwiceRockZoneTicket = new RockZoneTicket(888, ticketInfo.get(1),300);
        VIPTicket TwiceVIPTicket = new VIPTicket(788, ticketInfo.get(1),300);
        NormalZoneTicket TwiceNormalZoneTicket = new NormalZoneTicket(688, ticketInfo.get(1),400);
        // add to array of each area
        RockZoneTicket.add(TwiceRockZoneTicket);
        VIPTicket.add(TwiceVIPTicket);
        NormalZoneTicket.add(TwiceNormalZoneTicket);
        
        //JayChou Ticket
        RockZoneTicket JayChouRockZoneTicket = new RockZoneTicket(998, ticketInfo.get(2),400);
        VIPTicket JayChouVIPTicket = new VIPTicket(898, ticketInfo.get(2),400);
        NormalZoneTicket JayChouNormalZoneTicket = new NormalZoneTicket(798, ticketInfo.get(2),500);
        // add to array of each area
        RockZoneTicket.add(JayChouRockZoneTicket);
        VIPTicket.add(JayChouVIPTicket);
        NormalZoneTicket.add(JayChouNormalZoneTicket);    
        
        //Start of the program
        System.out.println("Welcome to Our Ticket System");
        
        //Display Concert Event
        //Prompt user to select concert they willing to go
        System.out.println("\nPls Select Your Ticket");
        System.out.format("%-16s %-13s %-5s", "Artist", "Date", "Venue");
        for (int i = 0; i < ticketInfo.size(); i++) {
            System.out.println( "\n"+(i+1) + ". "+ ticketInfo.get(i).toString());
        }
        System.out.println("Your selection: ");
        int optionConcert = sc.nextInt()-1;
       
        //select area of concert
        //display area selection
        System.out.println("\nYou have choose "+ ticketInfo.get(optionConcert).getArtist() + " concert ticket\n "
                    + "Area available: ");
        
        switch (optionConcert) {
            case 0:
                DisplayAreaConcert(RockZoneTicket,VIPTicket,NormalZoneTicket,optionConcert);
                break;
            case 1:
                DisplayAreaConcert(RockZoneTicket,VIPTicket,NormalZoneTicket,optionConcert);
                break;
            case 2:
                DisplayAreaConcert(RockZoneTicket,VIPTicket,NormalZoneTicket,optionConcert);
                break;
            default:
                break;
        }
        
      
    }
    
    
    //display area of concert
    public static void DisplayAreaConcert(ArrayList<RockZoneTicket> RockZoneTicket,
            ArrayList<VIPTicket> VIPTicket,
            ArrayList<NormalZoneTicket> NormalZoneTicket,
            int option ){
            System.out.println("1."+RockZoneTicket.get(option).toString());
            System.out.println("2." +VIPTicket.get(option).toString());
            System.out.println("3."+NormalZoneTicket.get(option).toString());
    }
}

