package Modelos;

public class presentaciones {
    String id_presentacion;
    String powerpoint;
    String presen_descripcion;
    
    public presentaciones(){
    }
    
    public presentaciones(String id_presentacion , String powerpoint , String presen_descripcion){
        this.id_presentacion = id_presentacion;
        this.powerpoint = powerpoint;
        this.presen_descripcion = presen_descripcion;
    }

    public String getId_presentacion() {
        return id_presentacion;
    }

    public void setId_presentacion(String id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public String getPowerpoint() {
        return powerpoint;
    }

    public void setPowerpoint(String powerpoint) {
        this.powerpoint = powerpoint;
    }

    public String getPresen_descripcion() {
        return presen_descripcion;
    }

    public void setPresen_descripcion(String presen_descripcion) {
        this.presen_descripcion = presen_descripcion;
    }
    

    
    
}
