/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author sunbe
 */
public class Car implements CanTravel {

    public double move(double miles) {
        double mph = 60;
        double total = ((miles / mph) + 0.333 * (int) miles / 300);
        int hours = (int)(total);
        int minutes = (int) (((miles / mph) - hours) * 60);

        System.out.println("Taveled " + miles + "miles by "+this.getClass()+ " in " + hours + ":" + minutes);
        //for ever 300 miles add 20 min or 1/3 hour
        return total;
    }
}
