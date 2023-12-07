/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Juan Pablo
 */
public class VistaUC {
    
    String clase_descripcion;
    String us_nombre;
    String us_apellido;
    String correo;

    public VistaUC() {
    }

    public VistaUC(String clase_descripcion, String us_nombre, String us_apellido, String correo) {
        this.clase_descripcion = clase_descripcion;
        this.us_nombre = us_nombre;
        this.us_apellido = us_apellido;
        this.correo = correo;
    }

    public String getClase_descripcion() {
        return clase_descripcion;
    }

    public void setClase_descripcion(String clase_descripcion) {
        this.clase_descripcion = clase_descripcion;
    }

    public String getUs_nombre() {
        return us_nombre;
    }

    public void setUs_nombre(String us_nombre) {
        this.us_nombre = us_nombre;
    }

    public String getUs_apellido() {
        return us_apellido;
    }

    public void setUs_apellido(String us_apellido) {
        this.us_apellido = us_apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
