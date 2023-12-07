package Modelos;

public class Asistencia {
    int DIA;
    int MES;
    int ANIO;
    int CODIGO_CLASE_ASISTENCIA;
    int ID_USUARIO_ASISTENCIA;
    
    public Asistencia(){
    }
    
    public Asistencia(int DIA , int MES , int ANIO,int CODIGO_CLASE_ASISTENCIA, int ID_USUARIO_ASISTENCIA){
        this.DIA = DIA;
        this.MES = MES;
        this.ANIO = ANIO;
        this.CODIGO_CLASE_ASISTENCIA = CODIGO_CLASE_ASISTENCIA;
        this.ID_USUARIO_ASISTENCIA = ID_USUARIO_ASISTENCIA;
    }

    public int getDIA() {
        return DIA;
    }

    public void setDIA(int DIA) {
        this.DIA = DIA;
    }

    public int getMES() {
        return MES;
    }

    public void setMES(int MES) {
        this.MES = MES;
    }

    public int getANIO() {
        return ANIO;
    }

    public void setANIO(int ANIO) {
        this.ANIO = ANIO;
    }
    
    public int getCODIGO_CLASE_ASISTENCIA() {
        return CODIGO_CLASE_ASISTENCIA;
    }

    public void setCODIGO_CLASE_ASISTENCIA(int CODIGO_CLASE_ASISTENCIA) {
        this.CODIGO_CLASE_ASISTENCIA = CODIGO_CLASE_ASISTENCIA;
    }

    public int getID_USUARIO_ASISTENCIA() {
        return ID_USUARIO_ASISTENCIA;
    }

    public void setID_USUARIO_ASISTENCIA(int ID_USUARIO_ASISTENCIA) {
        this.ID_USUARIO_ASISTENCIA = ID_USUARIO_ASISTENCIA;
    }
    
    
}
