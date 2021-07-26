/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

/**
 *
 * @author Hergonza
 */
public class Habitacion {
    private int piso;
    private int cantidadPersonas;

    public Habitacion() {
    }

    public Habitacion(int piso, int cantidadPersonas) {
        this.piso = piso;
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "piso=" + piso 
                + ", cantidadPersonas=" + cantidadPersonas + '}';
    }
    
    public boolean determinarDisponibilidad(){
        boolean disponible = true;
        
        return(disponible);
    }
    
    public boolean consutarBalcon(){
        boolean balcon = true;
        
        return(balcon);
    }
}
