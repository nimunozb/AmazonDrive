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

    public Productos(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.entregado=false;
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


    
    
    
}
