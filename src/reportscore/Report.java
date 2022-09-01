/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscore;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Report implements Source {
   private final ArrayList<MyObserver> list;
   private int thaiScore;
   private int uaeScore;

   public Report(){
       this.list = new ArrayList<MyObserver>();
   }
   
//   public void setSomeData(int aData){
//       someData = aData;
//       notifyObservers();
//   }
   public void thaiAddScore(){
       thaiScore +=1;
        notifyObservers();
   }
   public int getThaiScore(){
       return thaiScore;
   }
   public void uaeAddScore(){
       uaeScore +=1;
       notifyObservers();
   }
   public int getUaeScore(){
       return uaeScore;
   }
   @Override
 public void register (MyObserver observer){
     list.add(observer);
 }
    @Override
 public void notifyObservers(){
     for(int i = 0;i < list.size(); ++i){
         list.get(i).update(this);
     }
 }
}
