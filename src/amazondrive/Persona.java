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
public class Persona {
    private String Nombre;
    private int dineroDisponible;

    public Persona() {
    }

    public Persona(String Nombre, int dineroDisponible) {
        this.Nombre = Nombre;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
    
    
            
}
