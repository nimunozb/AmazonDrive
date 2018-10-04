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
// static Posicion posicionk=new Posicion(0,0,1);
 //private static ArrayList<UsuarioAmazonDrive>usuarios =new ArrayList<>();
 
// private static thing    
    
    public static void main(String[] args) {
      AmazonDrive amazon=new AmazonDrive();
      ArrayList<Posicion>posicion=new ArrayList<>();
      UsuarioAmazonDrive usuariof=new UsuarioAmazonDrive("Fabian Andres Giraldo",96549129,1234);
     
      amazon.bodega.RecogerEstante(bodega.getProdutosaIngresar(),0,9);// teniento un array de productos a ingresar, este metodo hace que 
                                                         //el robot recoja el estante disponible e introdusca los productos en los estantes
    

// usuariof.hacerPedido(amazon);
     // posicion.add(posicionk);
     // bodega.enviarProducto(posicion);
       
   }

    public AmazonDrive() {
    
     
     bodega=new BodegaDrive();
     
     
    }

    public static BodegaDrive getBodega() {
        return bodega;
    }

    public static void setBodega(BodegaDrive bodega) {
        AmazonDrive.bodega = bodega;
    }

    /**
     * @deprecated: lo que tenia pensado de este metodo es que dado la cantidad de pedidos, los identificadores de los productos
     * y la cantidad de cada producto, se pudiera enviar el producto, con la ayuda del metodo enviar producto de bodega
     * @param productos
     * @param cantidad 
     */
    
  public static void buscarPedido(ArrayList<Integer>identificador,ArrayList<Integer>cantidad){ 
      ArrayList<Posicion>posicionEstante=new ArrayList<>();
      for (int i = 0; i <cantidad.size(); i++) {//repite tanta veces como pedidos de productos
          for (int j = 0; j <cantidad.get(i); j++) {//repite por la catidad de unidades de un producto
              int a=identificador.get(i);
           posicionEstante.add(bodega.buscarInventarioProducto(a));
   }} ArrayList<Posicion>estantesComun=new ArrayList<>();
      for (int i = 0; i <posicionEstante.size(); i++) {//repite tentas veces como la cantidad de productos que haya
          if (posicionEstante.get(0)==posicionEstante.get(i)){// agrupa los productos que pertenecen al mismo estante
              estantesComun.add(posicionEstante.get(i));
          }} bodega.enviarProducto(estantesComun);
  
  
 
  
  }








}
 