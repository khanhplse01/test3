/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benahomeworks;

import Data.Circle;
import Data.Triangle;
import Data.TriangleSquare;

/**
 *
 * @author phanluukhanh
 */
public class BeNaHomeWorks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle nhon = new Triangle("Red", "Khanh", 3.0, 4.0, 6.0);
        nhon.showDetail();
        TriangleSquare vuong = new TriangleSquare("Pink", "Brother", 3.0, 4.0, 5.0);
        vuong.showDetail();
        Circle tron = new Circle("White", "blahhhh", 3.8);
        tron.showDetail();
    }
    
}
