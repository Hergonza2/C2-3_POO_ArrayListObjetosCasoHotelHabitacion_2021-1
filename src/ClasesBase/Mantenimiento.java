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
public class Mantenimiento {
    
    private String fechaMantenimiento;

    public Mantenimiento(String fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    /**
     * Get the value of fechaMantenimiento
     *
     * @return the value of fechaMantenimiento
     */
    public String getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    /**
     * Set the value of fechaMantenimiento
     *
     * @param fechaMantenimiento new value of fechaMantenimiento
     */
    public void setFechaMantenimiento(String fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" + "fechaMantenimiento=" + fechaMantenimiento + '}';
    }

}
