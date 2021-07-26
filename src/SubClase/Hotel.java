/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubClase;

import ClasesBase.Habitacion;
import SuperClase.Vivienda;
import java.util.ArrayList;


/**
 *
 * @author Hergonza
 */
public class Hotel extends Vivienda{
    private int añoConstruccion;
    private ArrayList <Habitacion> datoHabitacion;

    public Hotel() {
    }

    public Hotel(int añoConstruccion) {
        this.añoConstruccion = añoConstruccion;
    }

    public Hotel(int añoConstruccion, String direccion,
            ArrayList<Habitacion> datoHabitacion) {
        super(direccion);
        this.añoConstruccion = añoConstruccion;
        this.datoHabitacion = datoHabitacion;
    }

    public ArrayList<Habitacion> getDatoHabitacion() {
        return datoHabitacion;
    }

    public void setDatoHabitacion(ArrayList<Habitacion> datoHabitacion) {
        this.datoHabitacion = datoHabitacion;
    }

    

    
    public int getFechaConstruccion() {
        return añoConstruccion;
    }

    public void setFechaConstruccion(int fechaConstruccion) {
        this.añoConstruccion = fechaConstruccion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "añoConstruccion=" + añoConstruccion + '}'
                + super.toString();
    }
    
    public double calcularAntiguedad(){
        double edad = 2021 - añoConstruccion;
        return(edad);
    }
    
}
