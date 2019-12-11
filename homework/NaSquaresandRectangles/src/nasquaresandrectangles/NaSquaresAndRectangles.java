/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasquaresandrectangles;

import Data.Rectangle;
import Data.Square;

/**
 *
 * @author phanluukhanh
 */
public class NaSquaresAndRectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        naSquares();
        naRectangles();
//        kế thừa sẽ giúp các class có vẻ khác biệt ở chung 1 mảng với nhau

    }

    public static void naSquares() {
        Square s[] = new Square[5];
        s[0] = new Square("Khanh", "blue", 2.5);
        s[1] = new Square("Bach", "rose", 1.8);
        s[2] = new Square("Van", "yellow", 0.9);
        s[3] = new Square("Duy", "saphie", 7.0);
        s[4] = new Square("Nguyen", "ruby", 4.5);
        System.out.println("All Squares of Na");
        for (Square x : s) {
//            System.out.println(""+x);
            x.showDetail();
        }
    }

    public static void naRectangles() {
        Rectangle r[] = new Rectangle[5];
        r[0] = new Rectangle("khanh", "black", 9.9, 5.5);
        r[1] = new Rectangle("Bach", "pink", 7.2, 2.7);
        r[2] = new Rectangle("Van", "green", 4.1, 2.2);
        r[3] = new Rectangle("Nhi", "green", 6.9, 1.6);
        r[4] = new Rectangle("Han", "green", 8.4, 7.1);
        System.out.println("All Rectangles of Na");
                // sort mảng giảm dần theo diện tích
        Rectangle t = r[1];
        for (int i = 0; i < 4; i++) {
            
            for (int j = i+1; j <5 ; j++) {
                if (r[i].getArea()<r[j].getArea())
                    t = r[i];
                    r[i] = r[j];
                    r[j] = t;
            }
            
        }
        for (int i = 0; i < r.length; i++) { // cẩn thận vì dễ bị null exception
            r[i].showDetail();
        }

    }
//    r[0] = r1 ; vietsub r[0] mang địa chỉ đc chứa trong r1 
}
