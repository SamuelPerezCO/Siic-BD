/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Juan Pablo
 */
public class VistaPC {
    
    int id_pres_cla;
    String clase_descripcion;
    String presen_descripcion;

    public VistaPC() {
    }

    public VistaPC(int id_pres_cla, String clase_descripcion, String presen_descripcion) {
        this.id_pres_cla = id_pres_cla;
        this.clase_descripcion = clase_descripcion;
        this.presen_descripcion = presen_descripcion;
    }

    public int getId_pres_cla() {
        return id_pres_cla;
    }

    public void setId_pres_cla(int id_pres_cla) {
        this.id_pres_cla = id_pres_cla;
    }

    public String getClase_descripcion() {
        return clase_descripcion;
    }

    public void setClase_descripcion(String clase_descripcion) {
        this.clase_descripcion = clase_descripcion;
    }

    public String getPresen_descripcion() {
        return presen_descripcion;
    }

    public void setPresen_descripcion(String presen_descripcion) {
        this.presen_descripcion = presen_descripcion;
    }
    
    
}
