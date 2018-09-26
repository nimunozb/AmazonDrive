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

    public Productos[][] getcajonProducto() {
        return cajonProducto;
    }

    public void setcajonProducto(Productos[] producto, int a, int b, int c) {
        this.cajonProducto[a][b] = producto[c];
      
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

    public Posicion compartimentosDisponibles(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
               if(this.cajonProducto[i][j]==null){
                   this.posiciondelcajon.setStreed(i);
                   this.posiciondelcajon.setAvenue(j);
                   return this.posiciondelcajon;
               }
            }
        }
        
        return null;
    }
    
    
    
}
