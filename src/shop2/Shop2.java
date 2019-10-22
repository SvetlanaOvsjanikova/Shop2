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
public class Shop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        Autentification mansAut = new Autentification();
        Autentification.autentification();
        
        do {
            System.out.println("Ko Jūs gribat nopirkt?");
            System.out.println("1 - Apģērbs\n2 - Apavi");
            option = in.nextInt();
            
            switch(option){
                case 1: //Apģērbs
                    System.out.println("Kādu apģērbu Jūs gribat nopirkt?");
                    System.out.println("1 - Krekls \n2 - Bikses");
                    option = in.nextInt();
                    
                    if (option == 1) {                        
                        System.out.println("Ievadiet izmēru: 36-60 ");
                        int s = in.nextInt();
                            if (s >= 36 && s <= 60) {                                
                                    System.out.println("Ievadiet preces daudzumu: ");
                                    int q = in.nextInt();
                                    if (q <=5) {
                                System.out.println("Jūsu izvēlētas preces kods: 1234ak"); 
                                //надо присвоить переменную из БД, вместо 1234ak, если возможно
                            }    else if (q > 5) {
                                    System.out.println("Diemžēl tāda daudzuma tagad nav mūsu noliktavā");
                                }
                            
                        }else{
                                System.out.println("Diemžēl tāda izmēra tagad nav mūsu noliktavā");
                                }                    
                    }
                    
                    if (option == 2) {                        
                        System.out.println("Ievadiet izmēru: 36-60 ");
                        int s = in.nextInt();
                            if (s >= 36 && s <= 60) {                                
                                    System.out.println("Ievadiet preces daudzumu: ");
                                    int q = in.nextInt();
                                    if (q <=5) {
                                System.out.println("Jūsu izvēlētas preces kods: 1234ab"); 
                                //надо присвоить переменную из БД, вместо 1234ab, если возможно
                            }    else if (q > 5) {
                                    System.out.println("Diemžēl tāda daudzuma tagad nav mūsu noliktavā");
                                }
                            
                        }else{
                                System.out.println("Diemžēl tāda izmēra tagad nav mūsu noliktavā");
                                }                    
                    }
                    
                break;
                
                case 2:
                    System.out.println("Kādus apavus Jūs gribat nopirkt?");
                    System.out.println("1 - sandales \n2 - kurpes");
                    option = in.nextInt();
                    
                    if (option == 1) {                        
                        System.out.println("Ievadiet izmēru: 39-45 ");
                        int s = in.nextInt();
                            if (s >= 39 && s <= 45) {                                
                                    System.out.println("Ievadiet preces daudzumu: ");
                                    int q = in.nextInt();
                                    if (q <=5) {
                                System.out.println("Jūsu izvēlētas preces kods: 4321az"); 
                                //надо присвоить переменную из БД, вместо 4321az, если возможно
                            }    else if (q > 5) {
                                    System.out.println("Diemžēl tāda daudzuma tagad nav mūsu noliktavā");
                                }
                            
                        }else{
                                System.out.println("Diemžēl tāda izmēra tagad nav mūsu noliktavā");
                                }                    
                    }
                    
                    if (option == 2) {                        
                        System.out.println("Ievadiet izmēru: 36-42 ");
                        int s = in.nextInt();
                            if (s >= 36 && s <= 42) {                                
                                    System.out.println("Ievadiet preces daudzumu: ");
                                    int q = in.nextInt();
                                    if (q <=5) {
                                System.out.println("Jūsu izvēlētas preces kods: 4321ak"); 
                                //надо присвоить переменную из БД, вместо 4321ak, если возможно
                            }    else if (q > 5) {
                                    System.out.println("Diemžēl tāda daudzuma tagad nav mūsu noliktavā");
                                }
                            
                        }else{
                                System.out.println("Diemžēl tāda izmēra tagad nav mūsu noliktavā");
                                }                    
                    }
                    
                break;
                
          default:
            System.out.println("Nav tādas izvēles");
            break;
            }
            //System.out.println("Jūsu pasūtījuma numurs ir: "); //номер присвоить из БД (не знаю как)           
            System.out.println("Vai vēlaties pasūtīt vēl preces? (0 - iziet)");
            option = in.nextInt();
            
        } while (option !=0);
        
        Shipping mansShip = new Shipping();
        mansShip.shipping();
        System.out.println("Jūsu pasūtījuma numurs ir: "); //номер присвоить из БД (не знаю как
    }
    
}
