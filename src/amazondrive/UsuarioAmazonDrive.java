/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Horacio
 */
public class UsuarioAmazonDrive {
    private int identificador;
    private Persona persona=new Persona();
   
    public UsuarioAmazonDrive() {
    }

    public UsuarioAmazonDrive(String nombrePresona,int dinero,int identificador) {
        this.identificador = identificador;
        this.persona.setNombre(nombrePresona);
        this.persona.setDineroDisponible(dinero);
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

   /**
    * @deprecated: este metodo hace las preguntas al usuario para saber que productos se ha de enviar, utilizando un metodo de amazon llamado buscar
    * pedidos.
    * @param amazon 
    */
    
    public void hacerPedido(AmazonDrive amazon){
        ArrayList<Integer>productos=new ArrayList<>();
        ArrayList<Integer>cantidad=new ArrayList<>();
        Productos productosk=new Productos();
        
        Scanner joker=new Scanner(System.in); 
        System.out.println("Intruduce el numero de pedidos que vas a realizar");
        int cantidadPedidos=joker.nextInt();
       
        for (int i = 0; i <cantidadPedidos ; i++) {//repite tantas veces como la cantidad de pedidios que se va a realizar
        System.out.println("Introduce el identificador del producto "+i+" que vas comprar");//pregunta por el identificador del producto y lo guarda
        int identificadorProducto=joker.nextInt(); 
        productos.add(i,identificadorProducto);
       
        System.out.println("Introduce el numero de productos");//pregunta por la cantidad de cada producto que el usuario quiere comprar
        int cantidadProductos=joker.nextInt();
        cantidad.add(i, cantidadProductos);
        }
        
       amazon.buscarPedido(productos, cantidad);
        
        
        
        
    }
    
    
}
