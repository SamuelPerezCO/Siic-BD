/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Asus
 */
public class Usuario {
    
    private int id_usuario;
    private String contrasenia;
    private String cc_nombre;
    private String cc_apellido;
    private String cc_segApellido;
    private String correo;
    private int codigo_perfil;
    
    public Usuario() {
    }

    public Usuario(int id_usuario, String contrasenia, String cc_nombre, String cc_apellido, String cc_segApellido, String correo, int codigo_perfil) {
        this.id_usuario = id_usuario;
        this.contrasenia = contrasenia;
        this.cc_nombre = cc_nombre;
        this.cc_apellido = cc_apellido;
        this.cc_segApellido = cc_segApellido;
        this.correo = correo;
        this.codigo_perfil = codigo_perfil;
    }

    public Usuario(int aInt, String string, String string0, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCc_nombre() {
        return cc_nombre;
    }

    public void setCc_nombre(String cc_nombre) {
        this.cc_nombre = cc_nombre;
    }

    public String getCc_apellido() {
        return cc_apellido;
    }

    public void setCc_apellido(String cc_apellido) {
        this.cc_apellido = cc_apellido;
    }

    public String getCc_segApellido() {
        return cc_segApellido;
    }

    public void setCc_segApellido(String cc_segApellido) {
        this.cc_segApellido = cc_segApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodigo_perfil() {
        return codigo_perfil;
    }

    public void setCodigo_perfil(int codigo_perfil) {
        this.codigo_perfil = codigo_perfil;
    }


    

   
    
    
    
}
