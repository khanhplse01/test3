/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Scanner;
//~ #include <stdio.h> bên c //standard input output
// tức là xài đồ của người khác phải xin phép

/**
 *
 * @author phanluukhanh
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int n;
        System.out.println("input a number >=2: ");
        Scanner banPhimCuaTui = new Scanner(System.in);
        n = banPhimCuaTui.nextInt();
        
        printPrimes(n);
    }
    
        // hàm trả về true / false nếu n là snt
    
    public static boolean isPrime(int n)
    {
       if (n<2)
       {
           return false; // số nt bé nhất là 2 
       }
       if ( n ==2)
           return true;
       //ngược ại n lớn hơn 2 thì xét các US trong đoạn 
       //từ 2-> căn của n. Coi xem n có lỡ tay chia hết 
       //cháu nào từ 2-> căn, thì n ko à nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n%i == 0) 
              return false;
        }
        return true;
        
    }
    // hàm in ra các snt từ 2 ..n
    public static void printPrimes(int n)
    {
        if (n <2)
        {
            System.out.println("Invalid n: n must be >=2");
        return;
        }//return void, thoát hàm ko thèm làm nữa
        // ngược lại, n >=2 in thôi 
        System.out.println("The list of prime form 2 to "+n);
        for (int i = 2; i <=n; i++) {
            if (isPrime(i))
                System.out.print(i +" ");
        }
    }       
}
