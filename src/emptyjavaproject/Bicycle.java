/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Random;

/**
 *
 * @author sunbe
 */
public class Bicycle implements CanTravel {

    Random random = new Random();

    public double move(double miles) {
        double mph = 15;
        double total = (miles / mph);
        int hours = (int) (miles / mph);
        int minutes = (int) (((miles / mph) - hours) * 60);
        for (int i = 0; i < miles; i++) {
            if (random.nextInt(99) == 0) {

                System.out.println("the bike broke down at " + i + " miles in had to walk remaining " + (miles - i) + " miles");
                Walking walk = new Walking();
                walk.move(miles - i);
                System.out.println("Taveled " + i + "miles by " + this.getClass() + " in " + hours + ":" + minutes);
                return total+(5.5*(miles-i));
            }
        }
        //will only get to this point if no breakdowns
        System.out.println("Taveled " + miles + "miles by " + this.getClass() + " in " + hours + ":" + minutes);
        return total;

    }
}
