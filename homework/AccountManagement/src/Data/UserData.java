/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author phanluukhanh
 */
public class UserData {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    public long balance;
    
    public UserData(String iD, String iName, String iEmail, String iPn, long iBalance)
    {
        id=iD;
        name=iName;
        email=iEmail;
        phoneNumber=iPn;
        balance=iBalance;
    }
    public void data()
    {
        System.out.println("User information:");
        System.out.println("ID: "+id);
        System.out.println("Name of user: "+name);
        System.out.println("Email: "+email);
        System.out.println("User Phone Number: "+phoneNumber);
        System.out.println("Account balance: "+balance+"VND");
        
    }
    public void setBalance(long newBalance)
    {
        
        balance = newBalance;
        
        
    }
    
}
