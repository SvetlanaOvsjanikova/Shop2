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
public class Shipping {
    Scanner in = new Scanner(System.in);   
    
    void shipping(){
        int shipoption;
        
        //do {
            System.out.println("Kā Jūs gribat piegādāt preci?");
            System.out.println("1 - Paņemt mūsu veikalā\n2 - Ar kurjeru");
            shipoption = in.nextInt();
            
            switch (shipoption){
                case 1: //veikalā
                    System.out.println("Jūsu pasutījums būs sagtavots divu dienu laikā un Jūs varat to izņemt"
                            + "mūsu birojā Brīvibas ielā 134/2.");
                break;
                
                case 2: //ar kurjeru
                    System.out.println("Ievadiet lūdzu, Jūsu adresi: ");
                    String adress = in.next();
                    System.out.println("Jūsu pasutījums būs sagtavots divu dienu laikā un izsūtīts pēc Jūsu norādītās adreses" );
                break;
            default:
            System.out.println("Nav tādas izvēles");
            break;                
            }                          
           }  
        //while (shipoption !=0);
        //}
        
        
    }
          
   

