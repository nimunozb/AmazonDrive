/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;
import becker.robots.*;
/**
 *
 * @author Horacio
 */
public class AmazonDrive {
 private static BodegaDrive bodega;
   
   
// private static thing    
    
    public static void main(String[] args) {
      bodega=new BodegaDrive();
        for (int i = 0; i < 10; i++) {
             bodega.RecogerEstante();
        }
     
       
  
    }
}
 