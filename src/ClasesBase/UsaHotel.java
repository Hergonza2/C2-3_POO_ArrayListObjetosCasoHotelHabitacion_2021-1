/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

import SubClase.Hotel;
import SuperClase.Vivienda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hergonza
 */
public class UsaHotel {
    public static void main (String [] argv){
        // Datos del Hotel
        int añoConstruccion = 0;
        String nombreHotel = new String();
        int cantidadHabitaciones = 0;
        char opcion = 'S';
        
        // Datos de la Habitacion
        String numeroHabitacion = new String();
        int piso = 0;
        double area = 0.0;
        boolean balcon = true;
        boolean disponible = true;
        
        UsaHotel objUsaHotel = new UsaHotel();
        ArrayList <Hotel> vectorHotel = new ArrayList <Hotel>();
        ArrayList <Habitacion> datoHabitacion = new ArrayList<>();
        
        while (opcion == 'S'){
            nombreHotel = JOptionPane.showInputDialog("Nombre");
            añoConstruccion = Integer.parseInt(
                    JOptionPane.showInputDialog("Año Construccion"));
            
            cantidadHabitaciones = Integer.parseInt(
                    JOptionPane.showInputDialog("Cantidad de Habitaciones"));
            
            for (int cuentaHabitacion = 0; 
                   cuentaHabitacion < cantidadHabitaciones; ++cuentaHabitacion){
            
                numeroHabitacion = JOptionPane.showInputDialog(
                        "Numero Habitacion:");
                piso = Integer.parseInt(
                    JOptionPane.showInputDialog("Numero piso"));
                area = Double.parseDouble(
                    JOptionPane.showInputDialog("Area Habitacion"));    
                cantidadHabitaciones = Integer.parseInt(
                    JOptionPane.showInputDialog("Cantidad max. Huespedes"));
                disponible = Boolean.parseBoolean(
                        JOptionPane.showInputDialog("está disponible true/false"));
                balcon = Boolean.parseBoolean(
                        JOptionPane.showInputDialog("tiene balcon true/false"));
                
                datoHabitacion.add(new Habitacion(piso, cantidadHabitaciones));
            }
                
            vectorHotel.add(new Hotel(
                    añoConstruccion, nombreHotel,datoHabitacion));
            opcion = JOptionPane.showInputDialog(
                    "Mas Datos? S/N").toUpperCase().charAt(0);
        }
        objUsaHotel.mostrarDatos(vectorHotel);
    }
    
    public void mostrarDatos(ArrayList<Hotel> vectorHotel){
        for (int indice = 0; indice < vectorHotel.size(); ++ indice){
            System.out.println(vectorHotel.get(indice) 
                    + "" + vectorHotel.get(indice).calcularAntiguedad() 
                    + '\n');
        }
    }
}
