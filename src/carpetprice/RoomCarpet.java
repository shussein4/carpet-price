/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetprice;

/**
 *
 * @author saremhussein
 */
public class RoomCarpet {
   private RoomDimension size;
   private double carpetcost;

   public RoomCarpet(RoomDimension dim, double cost){
       size=dim;
       carpetcost=cost;
       
   }
    public RoomCarpet(RoomCarpet roomCarpet)
        {

        }

   public double getTotalCost()
   {
       return carpetcost * size.getArea();
   }
  
    
public String toString() {
   
               return "" + size + ""
                       + ", Carpet cost per square feet = $" 
                       + carpetcost + ", " + "Total cost = $" 
                       + getTotalCost() + "";       
        }
   
   
   }

