/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscore;

/**
 *
 * @author ASUS
 */
public class Uae implements MyObserver {
      @Override
    public void update(Source o){
        System.out.println(
        "live result :THA "+ ((Report)o).getThaiScore()+ "-" +((Report)o).getUaeScore()+" "+"UAE" );
        
    }
}
