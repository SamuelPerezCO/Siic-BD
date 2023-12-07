/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Juan Pablo
 */
public class PreCla {
    
    int id_pres_cla;
    int codigo_clase;
    int codigo_presen;

    public PreCla() {
    }

    public PreCla(int id_pres_cla, int codigo_clase, int codigo_presen) {
        this.id_pres_cla = id_pres_cla;
        this.codigo_clase = codigo_clase;
        this.codigo_presen = codigo_presen;
    }

    public int getId_pres_cla() {
        return id_pres_cla;
    }

    public void setId_pres_cla(int id_pres_cla) {
        this.id_pres_cla = id_pres_cla;
    }

    public int getCodigo_clase() {
        return codigo_clase;
    }

    public void setCodigo_clase(int codigo_clase) {
        this.codigo_clase = codigo_clase;
    }

    public int getCodigo_presen() {
        return codigo_presen;
    }

    public void setCodigo_presen(int codigo_presen) {
        this.codigo_presen = codigo_presen;
    }
}