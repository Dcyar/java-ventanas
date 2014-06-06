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
    
    public String getNombre(){
        return this.nombre;
    }
    public int getNumCuenta(){
        return this.numero_cuenta;
    }
    public int getMonto(){
        return this.monto;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setNumCuenta(int nc){
        this.numero_cuenta = nc;
    }
    public void setMonto(int m){
        this.monto = m;
    }
    public void mostrarDatos(){
        System.out.printf("Nombre:\t\t\t %s\nNúmero de cuenta:\t %d\nDepósito:\t\t %d", this.nombre,this.numero_cuenta,this.monto);
    }
}
