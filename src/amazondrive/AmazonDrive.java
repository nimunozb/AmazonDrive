/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;
import becker.robots.*;
import java.util.ArrayList;

/**
 *
 * @author Horacio
 */
public class AmazonDrive {
 private static BodegaDrive bodega;
    static Posicion posicionk=new Posicion(0,0,0);
   
// private static thing    
    
    public static void main(String[] args) {
      bodega=new BodegaDrive();
      ArrayList<Posicion>posicion=new ArrayList<>();
     
   // bodega.RecogerEstante(bodega.getProdutosaIngresar(),0,9);
       
    
    posicion.add(posicionk);
        bodega.enviarProducto(posicion);
       
   }

    public AmazonDrive() {
    }

    public static BodegaDrive getBodega() {
        return bodega;
    }

    public static void setBodega(BodegaDrive bodega) {
        AmazonDrive.bodega = bodega;
    }

  public static void buscarPedido(ArrayList<Productos>productos,ArrayList<Integer>cantidad){ 
      ArrayList<Posicion>posicionEstante=new ArrayList<>();
      for (int i = 0; i <cantidad.size(); i++) {
          for (int j = 0; j <cantidad.get(i); j++) {
           posicionEstante.add(bodega.buscarInventarioProducto(productos.get(i)));
   }} ArrayList<Posicion>estantesComun=new ArrayList<>();
      for (int i = 0; i <posicionEstante.size(); i++) {
          if (posicionEstante.get(1)==posicionEstante.get(i)){
              estantesComun.add(posicionEstante.get(i));
              
          }
      
   
   }
  
  
  
  
  }








}
 