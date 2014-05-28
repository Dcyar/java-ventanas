/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formulario;

/**
 *
 * @author LAB09-PC01
 */
public class Persona {
    private String nombre;
    private int numero_cuenta;
    private int monto;
    
    public Persona(String nom, int ncuenta, int monto){
        this.nombre = nom;
        this.numero_cuenta = ncuenta;
        this.monto = monto;
        
        System.out.printf("Nombre:\t\t%s\n", this.nombre);
        System.out.printf("N° de cuenta:\t%d\n", this.numero_cuenta);
        System.out.printf("Deposito:\tS/.%d\n", this.monto);
        
    }
}
