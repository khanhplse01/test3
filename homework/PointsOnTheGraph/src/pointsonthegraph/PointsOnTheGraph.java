/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointsonthegraph;

import Data.Point;
import java.util.Random;

/**
 *
 * @author phanluukhanh
 */
public class PointsOnTheGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point pointOne = new Point("First point", 2.0, 1.0);
        Point pointTwo = new Point("Second point", 4.5, -2.0);
        Point pointThree = new Point("Third point", -1.5, 3.0);
        Point pointFour = new Point("Fourth point", 3.7, 10.0);
        Point pointFive = new Point("Fifth point", -7.0, -6.6);
        System.out.println("There are five point on the graph 0xy: ");
        System.out.println("" + pointOne.toString());
        System.out.println("" + pointTwo.toString());
        System.out.println("" + pointThree.toString());
        System.out.println("" + pointFour.toString());
        System.out.println("" + pointFive.toString());
        double x = 0.0, y=0.0, z=0.0, t=0.0;
        int a = rand(1, 5);
        switch (a){
            case 1:  x = pointOne.getX();
                     y = pointOne.getY();
                    break;
            case 2:  x = pointTwo.getX();
                     y = pointTwo.getY();
                    break;
            case 3:  x = pointThree.getX();
                     y = pointThree.getY();
                    break;
            case 4:  x = pointFour.getX();
                     y = pointFour.getY();
                    break;
            case 5:  x = pointFive.getX();
                     y = pointFive.getY();
                    break;
        }
        int b = rand(1,5);
        if (b==a){
        
            b = rand(1,5);
        }
         
         switch (b){
            case 1:  z = pointOne.getX();
                     t = pointOne.getY();
                    break;
            case 2:  z = pointTwo.getX();
                     t = pointTwo.getY();
                    break;
            case 3:  z = pointThree.getX();
                     t = pointThree.getY();
                    break;
            case 4:  z = pointFour.getX();
                     t = pointFour.getY();
                    break;
            case 5:  z = pointFive.getX();
                     t = pointFive.getY();
                    break;
        }    
        double n=0.0, m=0.0;// vì sao khi khai báo phải khai báo giá trị
        n=x-z; 
        m=y-t;
        
        System.out.print("Two point is " +a );// cách để 2 dòng này viết trong cùng 1 sout
        System.out.println(" and " + b); 
        distanceOfTwoPoint(n, m);

       

    }
    public static void distanceOfTwoPoint(double n, double m)
    {
        double d;
        d = Math.sqrt(Math.pow(n, 2) + Math.pow(m, 2));
        System.out.println("The distance is: " + d);
    }
    public static int rand(int min, int max) {
        
            Random rn = new Random();
            int range = max - min + 1;
            int ranDomNum = min + rn.nextInt(range);
            return ranDomNum;
       
        }
}
