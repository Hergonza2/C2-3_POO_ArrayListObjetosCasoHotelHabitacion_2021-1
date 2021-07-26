/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClase;

/**
 *
 * @author Hergonza
 */
public abstract class Vivienda {
    private String direccion;

    public Vivienda() {
    }

    public Vivienda(String direccion) {
        this.direccion = direccion;
    }

    protected String getDireccion() {
        return direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override 
    public String toString() {
        return "Vivienda{" + "direccion=" + direccion + '}';
    }
    
    protected abstract double calcularAntiguedad();
}
