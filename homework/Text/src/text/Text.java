/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phanluukhanh
 */
public class Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rand = rand(1, 5);
        System.out.println("Result: " + rand);
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        int n = 0;
        do {
            try {
                System.out.print("Enter a whole number: ");
                n = Integer.parseInt(in.nextLine());
                cont = false;
            } catch (Exception e) {
                System.out.println("Required integer!");
            }
        } while (cont == true || n < 10 || n > 50);

    }

    public static int rand(int min, int max) {

        Random rn = new Random();
        int range = max - min + 1;
        int ranDomNum = min + rn.nextInt(range);
        return ranDomNum;

    }
}
