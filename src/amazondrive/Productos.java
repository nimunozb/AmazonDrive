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
public class Productos {
    private String nombre;
    private int identificador;
    private Posicion posicionProducto;
    private String tipo;
    private boolean entregado;
    private boolean ingresado;
   

    public Productos(int identificador,String nombre, String tipo) {
        this.identificador=identificador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.entregado=false;
    }

    public Productos(String nombre, int identificador, Posicion posicionProducto, String tipo, boolean entregado, boolean ingresado) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.posicionProducto = posicionProducto;
        this.tipo = tipo;
        this.entregado = entregado;
        this.ingresado = ingresado;
    }

    public Productos(int identificador,String nombre , String tipo, boolean entregado, boolean ingresado) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.tipo = tipo;
        this.entregado = entregado;
        this.ingresado = ingresado;
    }
   
    
    
    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Posicion getPosicionProducto() {
        return posicionProducto;
    }

    public void setPosicionProducto(int estante,int cajon,int compartimento) {
        this.posicionProducto.setEstante(estante);
        this.posicionProducto.setStreed(cajon);
        this.posicionProducto.setAvenue(compartimento);
    }
     public void setPosicionProducto(int estante) {
        this.posicionProducto.setEstante(estante);
        
    }

    public boolean isIngresado() {
        return ingresado;
    }

    public void setIngresado(boolean ingresado) {
        this.ingresado = ingresado;
    }


    
    
    
}
