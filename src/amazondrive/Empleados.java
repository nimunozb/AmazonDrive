/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;

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
            public int  almacenarProducto(Productos producto[], int productodeinicio, int productoFinal, Estantes estante ){
        int cajon=estante.compartimentosDisponibles().getStreed();
        int compartimento= estante.compartimentosDisponibles().getAvenue();//establece el compartimento inicial disponibles
        
        while(cajon<3&&compartimento<7&&productodeinicio<=productoFinal){//repite tantas veces como haya de productos por almacenar
            estante.setcajonProducto(producto, cajon, compartimento, productodeinicio);
            System.out.println("Se ha guardado el producto "+producto[productodeinicio].getNombre()+" en el estante "+estante.getIdentificador()+
                     " en el cajon "+cajon+" en el comtimento "+compartimento);
               if (compartimento==6){cajon++;compartimento=-1;}//para que no se salga de la capacidad del estante
          compartimento++;productodeinicio++;
        }productodeinicio--;// acomodamiento
        if (productodeinicio==productoFinal){
            System.out.println("Se almacenaron todos los productos seleccionados");
            return 0;}
        else{ 
             int a=productoFinal-productodeinicio;
          //  if (a>0){
            System.out.println(productoFinal);
            System.out.println(productodeinicio);
        System.out.println("no se pudieron almacenar los ultimos "+a+" finales");
        return a;}
        //}
        
        //return 990;
       
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
         System.out.println("El producto "+estante.getcajonProducto()[a][b].getNombre()+" ubicado en el cajon "+a+" en el compartimento "+b+" ya ha sido enviado");     
      estante.getcajonProducto()[a][b]=null;
         
     }
     
     
     
 }       
    
}
