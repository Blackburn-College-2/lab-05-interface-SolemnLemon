/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Train train = new Train();
        
      roundTrip(new Walking());
      roundTrip(new Car());
      roundTrip(new Plane());
      roundTrip(new Bicycle());
      roundTrip(new Train());
      roundTrip(new RollerSkates());
      
    }

    public static void roundTrip(CanTravel transport) {
        System.out.println("RoundTrip!");
        System.out.println("leaving...");
        double total = transport.move(10);
        System.out.println("returning...");
        total += transport.move(10);
        System.out.println("Taveled  20 miles by " + transport.getClass() + " in " + total + ":" + (int) ((total - (int) total * 60)));
    }

}
