/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;

import static amazondrive.main.bodega;
import java.util.ArrayList;

/**
 *
 * @author Horacio
 */      
public class Empleados {
    private String nombre;
    private String funcion;

    public Empleados() {
    }

    public Empleados(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    } 

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    /**
     * @deprecated: este metodo utiliza un array de productos los cuales al selecinar su cantidad, se meten dentro de los estantes que esten vacios
     * @param producto
     * @param productodeinicio
     * @param productoFinal
     * @param estante
     * @return 
     */
 public void  almacenarProducto(ArrayList<Productos>producto,Estantes estante ){
         int contador=0;
         int produtoenarray=0;
         int i=0;
         
     while(contador>20){
         int a=0;
         while(i<producto.size()&&a==0){
             if(producto.get(i).isIngresado()==false){
                 produtoenarray=i;
                 a++;
         }
        producto.get(i).setPosicionProducto(estante.getPosiciondelcajon().getEstante());
        producto.get(i).setIngresado(true);
    }
        
    }
 }
        /**
         * @deprecated: se tenia pensado que con la ayuda de este metodo se pudieran enviar productos,esto lo hace el empleado en la hora que el
         * robot lleve el estante a donde esta el empleado, sabiendo el la posicion del producto dentro del estante
         * y el identificador del estante
         * @param estante
         * @param posicion 
         */
        
 public void entregaProducto(Estantes estante, ArrayList<Posicion>posicion){
     for (int i = 0; i < posicion.size(); i++) {
    int a=posicion.get(i).getStreed();
    int b=posicion.get(i).getAvenue();
         System.out.println("El producto "+estante.getCajonProducto()[a][b].getNombre()+" ubicado en el cajon "+a+" en el compartimento "+b+" ya ha sido enviado");     
      estante.getCajonProducto()[a][b]=null;
         
     }
     
     
     
 }       
    
}
