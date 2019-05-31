/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static void main(String[] args) {
        int item = 5;
        int limit = 10;
        int menu;
        Scanner sc = new Scanner(System.in);
        System.out.print("menu : ");
        menu = sc.nextInt();
        if (menu == 1) {
            if(item < limit){
                System.out.print("ใส่จำนวนที่จะ ADD : ");
                int amount = sc.nextInt();
                if(amount+item <= limit){
                    item =+ amount;
                    System.out.println("ADD เรียบร้อย");
                } else {
                    System.out.println("item ที่จะแอด มากกว่า limit");
                }
            } else {
                System.out.println("เต็มจ้า");
            }
        }
        
        else if(menu == 2){
            if(item > 0 ){
                System.out.print("ใส่จำนวนที่จะ remove : ");
                int amount = sc.nextInt();
                if(amount-item < 0){
                 
                    System.out.println("remove เรียบร้อย");
                } else {
                    item -= amount ;
                    System.out.println("item : " + item +",limit :" + limit);
                }       
            } else { 
                    System.out.println("ไม่มีของในโกดังจ้า");
                             
            }
        }
        
        else if(menu == 3){
            System.out.print("item" + item);
        } else {
            System.out.println("ไปเลือกใหม่!!!!");
            
        }

    }
}
