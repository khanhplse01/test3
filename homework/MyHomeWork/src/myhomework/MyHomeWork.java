/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhomework;

import java.util.Scanner;



/**
 *
 * @author phanluukhanh
 */
public class MyHomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Please input value of n: ");
        Scanner banPhimCuaTui = new Scanner(System.in);
        n = banPhimCuaTui.nextInt();
        if (checkPrimeNumber(n)== true)
        {
            System.out.println("N is the prime number");
        }
        else
            System.out.println("N is not the prime number");
        printPrime(n);
        sumOf(n);
    }
    public static boolean checkPrimeNumber (int n)
    {
        if (n<2)
            return false;
        if (n==2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n%i ==0)
            return false;
      
            
        }
        return true;
        
    }
    public static void printPrime (int n)
    {
        if (n<2)
        {
            System.out.println("Invalid n: n must be >=2 ");
            return;
        }
        else 
            System.out.println("List of prime numbers from 2.."+n);
        for (int i = 2; i <= n; i++) {
            if (checkPrimeNumber(i)==true)
                System.out.print(i +" ");
        }
               
    }   
    public static void sumOf (int n)
            
    {
        int s=0;
        for (int i = 0; i <=n; i++) {
            s=s+i;
            
        }
        System.out.println("\n Sum: "+s);
    }
}
