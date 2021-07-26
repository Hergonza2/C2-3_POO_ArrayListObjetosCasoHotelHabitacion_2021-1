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
    
    private int cantidadCamas;

   
    public Habitacion() {
    }

    public Habitacion(int piso, int cantidadPersonas, int cantidadCamas) {
        this.piso = piso;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
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

     /**
     * Get the value of cantidadCamas
     *
     * @return the value of cantidadCamas
     */
    public int getCantidadCamas() {
        return cantidadCamas;
    }

    /**
     * Set the value of cantidadCamas
     *
     * @param cantidadCamas new value of cantidadCamas
     */
    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "piso=" + piso + ", cantidadPersonas=" 
                + cantidadPersonas + ", cantidadCamas=" + cantidadCamas + '}';
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
