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
public class RollerSkates implements CanTravel{
    
     public double move(double miles){
         double mph=8;
         double total = (miles / mph);
                  int hours=(int)(miles / mph)+2;
        int minutes= (int)(((miles/mph)-hours)*60);
        System.out.println("Taveled " + miles + "miles by "+this.getClass()+ " in " + hours + ":" + minutes);
        return total;
  
    }
    
}
