/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Horacio
 */
public class main {
    public static BodegaDrive bodega=new BodegaDrive();
    
 
    
    
    
    
    public static void main(String[] args) {
      
   
    
      AmazonDrive amazon=new AmazonDrive(bodega);
      ArrayList<Posicion>posicion=new ArrayList<>();
      UsuarioAmazonDrive usuariof=new UsuarioAmazonDrive("Fabian Andres Giraldo",96549129,1234);
     
    
        JOptionPane.showMessageDialog(null,"primero presiona start en la interfas de karel","errer",JOptionPane.OK_OPTION);
       veAlmacenamiento almacenar=new veAlmacenamiento();
       almacenar.show();
          
     
       
   }




}
