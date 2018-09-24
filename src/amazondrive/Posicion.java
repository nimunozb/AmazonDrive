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
public class Posicion {
    private int streed;
    private int avenue;

    public Posicion() {
    }

    public Posicion(int streed, int avenue) {
        this.streed = streed;
        this.avenue = avenue;
    }

    public int getStreed() {
        return streed;
    }

    public void setStreed(int streed) {
        this.streed = streed;
    }

    public int getAvenue() {
        return avenue;
    }

    public void setAvenue(int avenue) {
        this.avenue = avenue;
    }
    
    
}
