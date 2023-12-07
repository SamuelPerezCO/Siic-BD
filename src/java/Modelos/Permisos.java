/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author serna
 */
public class Permisos {
    
    int id_permiso;
    String detalle_permiso;

    public Permisos() {
    }

    public Permisos(int id_permiso, String detalle_permiso) {
        this.id_permiso = id_permiso;
        this.detalle_permiso = detalle_permiso;
    }

    public int getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(int id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getDetalle_permiso() {
        return detalle_permiso;
    }

    public void setDetalle_permiso(String detalle_permiso) {
        this.detalle_permiso = detalle_permiso;
    }
}

