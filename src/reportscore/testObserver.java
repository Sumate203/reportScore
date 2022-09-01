/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscore;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class testObserver {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
    Thai obj1 = new Thai();
    Uae obj2 = new Uae();
    Report obj = new Report();
    obj.register(obj1);
    obj.register(obj2);
    int a = 0;
        Scanner inp = new Scanner(System.in);
        while(a == 0){
        System.out.print("Enter Score THA "+ obj.getThaiScore()+ "-" +obj.getUaeScore()+" "+"UAE"+" "+"Please choose to add score type 1 to add THAi score, type 2 to add UAE score");
        String type = inp.nextLine();
        if (type.equals("1")){
           obj.thaiAddScore();   
         }
         if (type.equals("2")){
           obj.uaeAddScore(); 
         }
         if(type.equals("")){
             a = 1;
         }
       }
    }
}
