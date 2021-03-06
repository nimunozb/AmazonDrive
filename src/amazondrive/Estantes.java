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
public class Estantes {
    
    private  int identificador;
    private  Productos [][]  cajonProducto=new Productos [3][7] ;
    private  Posicion posicion=new Posicion();
    private Posicion posiciondelcajon=new Posicion();
    private  boolean estado; // permite saber si el estante esta en la posicion 
   
  public void setPosicion(int a,int b) {
        this.posicion.setAvenue(b);
        this.posicion.setStreed(a);
    }
    
    public Estantes() {
    }

    public Estantes(int a, int b, int identificador) {
       setPosicion(a, b);
       this.estado=false;
       this.identificador=identificador;
       
            
        
    }

   
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Productos[][] getCajonProducto() {
        return cajonProducto;
    }

    public void setCajonProducto(Productos[][] cajonProducto) {
        this.cajonProducto = cajonProducto;
    }

    public Posicion getPosiciondelcajon() {
        return posiciondelcajon;
    }

    public void setPosiciondelcajon(Posicion posiciondelcajon) {
        this.posiciondelcajon = posiciondelcajon;
    }

   

    

    public Posicion getPosicion() {
        return posicion;
    }

  

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
/**
 *@deprecated: este metodo busca los los compartimentos dentro de los cajones en los estantes que estan disponibles 
 *
 * @return 
 */
    public Posicion compartimentosDisponibles(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) //recorre todos los cajones y los compartimentos de los cajones de un estante
               if(this.cajonProducto[i][j]==null){
                   this.posiciondelcajon.setStreed(i);
                   this.posiciondelcajon.setAvenue(j);
                   return this.posiciondelcajon;
               }
            }
        
        
        return null;
    }
    
    
    
}
