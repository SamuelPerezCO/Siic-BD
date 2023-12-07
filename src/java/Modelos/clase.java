/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.sql.Date;
/**
 *
 * @author serna
 */
public class clase {
    int ID_CLASE;
    String LINK_GRABACION;
    String CLASE_DESCRIPCION;
    
    public clase(){
    }
    
    public clase(int ID_CLASE , String LINK_GRABACION , String CLASE_DESCRIPCION){
        this.ID_CLASE = ID_CLASE;
        this.LINK_GRABACION = LINK_GRABACION;
        this.CLASE_DESCRIPCION = CLASE_DESCRIPCION;
    }

    public int getID_CLASE() {
        return ID_CLASE;
    }

    public void setID_CLASE(int ID_CLASE) {
        this.ID_CLASE = ID_CLASE;
    }

    public String getLINK_GRABACION() {
        return LINK_GRABACION;
    }

    public void setLINK_GRABACION(String LINK_GRABACION) {
        this.LINK_GRABACION = LINK_GRABACION;
    }
    public String getCLASE_DESCRIPCION() {
        return CLASE_DESCRIPCION;
    }

    public void setCLASE_DESCRIPCION(String CLASE_DESCRIPCION) {
        this.CLASE_DESCRIPCION = CLASE_DESCRIPCION;
    }
    
    
}
