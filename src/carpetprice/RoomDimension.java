/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetprice;

/**
 *
 */ 
class RoomDimension implements Cloneable {

    
    private double length;
    private double width;
    
    public RoomDimension(double len , double w)
    {
            length=len;
            width=w;
    }

    
   public double getArea(){
        return width * length;
    }
    
    public String toString(){
        String str= "Length: " + length + "width: " + width + "Area" + 
                this.getArea();
                return str;
    }
    

    }      

