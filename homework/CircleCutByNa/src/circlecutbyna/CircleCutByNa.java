/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecutbyna;

import Data.Circle;

/**
 *
 * @author phanluukhanh
 */
public class CircleCutByNa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circle hinhTron = new Circle("First Exercise", -2.0);
        System.out.println(""+hinhTron.toString());
        
        printArea(hinhTron.getRadius());
        
    }
    public static void circleArea(double n)
    {
        double s; 
        s=Math.pow(n, 2)*Math.PI;
        System.out.println("The area of square is: "+s);
        
    }
    public static boolean checkCircle(double n)
    {
        if (n>0 )
        {
            return true;  
        }
        else return false;
    }
    public static void printArea(double n)
    {
        if (checkCircle(n)==true)
        {
            System.out.println("Na cut a circle");
            circleArea(n);
        }
        else System.out.println("Na didn't cut a circle");
    }
}
