/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Juan Pablo
 */
public class Perfiles {
    
    int id_perfil;
    String descripcion_perfil;
    int codigo_rol;
    int codigo_permiso;

    public Perfiles() {
    }

    public Perfiles(int id_perfil, String descripcion_perfil, int codigo_rol, int codigo_permiso) {
        this.id_perfil = id_perfil;
        this.descripcion_perfil = descripcion_perfil;
        this.codigo_rol = codigo_rol;
        this.codigo_permiso = codigo_permiso;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getDescripcion_perfil() {
        return descripcion_perfil;
    }

    public void setDescripcion_perfil(String descripcion_perfil) {
        this.descripcion_perfil = descripcion_perfil;
    }

    public int getCodigo_rol() {
        return codigo_rol;
    }

    public void setCodigo_rol(int codigo_rol) {
        this.codigo_rol = codigo_rol;
    }

    public int getCodigo_permiso() {
        return codigo_permiso;
    }

    public void setCodigo_permiso(int codigo_permiso) {
        this.codigo_permiso = codigo_permiso;
    }
    
    
    
}
