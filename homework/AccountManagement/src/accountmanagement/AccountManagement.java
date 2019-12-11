/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmanagement;

import Data.UserData;
import java.util.Scanner;

/**
 *
 * @author phanluukhanh
 */
public class AccountManagement {
  
    
    public static void main(String[] args) {

        UserData userOne = new UserData("1246521", "Phan Luu Khanh", "phanluukhanh99@gmail.com", "0944323120", 3_000_000L);
      
        userOne.data();
       
        
    }
    
}
