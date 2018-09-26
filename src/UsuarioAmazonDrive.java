/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Horacio
 */
public class UsuarioAmazonDrive {
    private Persona cliente=new Persona();
    private int numeroCuenta;

    public UsuarioAmazonDrive() {
    }

    public UsuarioAmazonDrive(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    




    
}
