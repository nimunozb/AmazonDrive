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
        
        Productos productosk=new Productos();
        
       
       
       
        }
        
     //  amazon.buscarPedido(productos, cantidad);
        
        
        
        
    }
    
    

