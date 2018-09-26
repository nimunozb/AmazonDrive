/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;

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
    
    
        public int  almacenarProducto(Productos producto[], int productodeinicio, int productoFinal, Estantes estante ){
        int cajon=estante.compartimentosDisponibles().getStreed();
        int compartimento= estante.compartimentosDisponibles().getAvenue();
        
        while(cajon<3&&compartimento<7&&productodeinicio<=productoFinal){
            estante.setcajonProducto(producto, cajon, compartimento, productodeinicio);
            System.out.println("Se ha guardado el producto "+producto[productodeinicio].getNombre()+" en el estante "+estante.getIdentificador()+
                     " en el cajon "+cajon+" en el comtimento "+compartimento);
               if (compartimento==6){cajon++;compartimento=-1;}
          compartimento++;productodeinicio++;
        }productodeinicio--;
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
    
}
