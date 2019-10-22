/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2;

import java.util.Scanner;

/**
 *
 * @author sao_7
 */
public class Autentification {
    
public static void autentification(){
    String Username;
    String Password;
    String Admin;
    
    Password = "123";
    Username = "marina";
    Admin = "Admin";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();
    if (username.equals(Username) && password.equals(Password)) {
        System.out.println("Access Granted! Welcome!");
    }
         
    else if (username.equals(Admin) && password.equals(Admin)) {
        System.out.println("You are Admin");
        
      } else {
          System.out.println("Invalid Username & Password!");{    
    }
}
        
    }
}
