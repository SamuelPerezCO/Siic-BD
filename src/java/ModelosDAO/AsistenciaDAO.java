package ModelosDAO;

import Modelos.Asistencia;
import Oracle.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author serna
 */
public class AsistenciaDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List<Asistencia>lista = new ArrayList<>();
        String sql = "SELECT * FROM ASISTENCIAS ORDER BY ID_USUARIO_ASISTENCIA ASC";
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Asistencia as = new Asistencia();
                as.setDIA(rs.getInt(1));
                as.setMES(rs.getInt(2));
                as.setANIO(rs.getInt(3));
                as.setCODIGO_CLASE_ASISTENCIA(rs.getInt(4));
                as.setID_USUARIO_ASISTENCIA(rs.getInt(5));
                lista.add(as);
            }
        } catch (SQLException e) {
            System.err.println("El error en AsistenciaDAO es = " + e);
        }
        return lista;
    }
    
    public int agregar(Asistencia as){
        int r = 0;
        String sql = "insert into asistencias(DIA , MES , ANIO, CODIGO_CLASE_ASISTENCIA , ID_USUARIO_ASISTENCIA) values ( ? , ? , ? , ? , ?)";
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,as.getDIA());
            ps.setInt(2,as.getMES());
            ps.setInt(3,as.getANIO());
            ps.setInt(4,as.getCODIGO_CLASE_ASISTENCIA());
            ps.setInt(5,as.getID_USUARIO_ASISTENCIA());
            r = ps.executeUpdate();
            if(r == 1){
                r = 1;
            }else{
                r = 0;
            }
        } catch (SQLException e) {
            System.err.println("El error en agregar en AsistenciaDAO es = " + e);
        }
        return r;
    }
    public Asistencia listarId(int ID_USUARIO_ASISTENCIA){
        String sql = "select * from ASISTENCIAS where ID_USUARIO_ASISTENCIA = " + ID_USUARIO_ASISTENCIA;
        Asistencia as = new Asistencia();
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                as.setDIA(rs.getInt(1));
                as.setMES(rs.getInt(2));
                as.setANIO(rs.getInt(3));
                as.setCODIGO_CLASE_ASISTENCIA(rs.getInt(4));
                as.setID_USUARIO_ASISTENCIA(rs.getInt(5));
            }
        } catch (SQLException e) {
            System.err.println("El error en AsistenciaDAO es = " + e);
        }return as;
    }
    
    public int actualizar(Asistencia as){
        int r = 0;
        String sql = "update ASISTENCIAS set DIA = ? , MES = ? ,ANIO = ? , CODIGO_CLASE_ASISTENCIA = ? where ID_USUARIO_ASISTENCIA = ?";
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1 , as.getDIA());
            ps.setInt(2, as.getMES());
            ps.setInt(3, as.getANIO());
            ps.setInt(4, as.getCODIGO_CLASE_ASISTENCIA());
            ps.setInt(5 , as.getID_USUARIO_ASISTENCIA());
            r = ps.executeUpdate();
            if(r == 1){
                r = 1;
            }else{
                r = 0;
            }
        } catch (SQLException e) {
            System.err.println("El error en actualizar de AsistenciaDAO es = " + e);
        }return r;
    }
    public void Borrar (int ID_USUARIO_ASISTENCIA){
        String sql = "delete from ASISTENCIAS where ID_USUARIO_ASISTENCIA = " + ID_USUARIO_ASISTENCIA;
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("El error en borrar en AsistenciaDAO es = " + e);
        }
    }
}
