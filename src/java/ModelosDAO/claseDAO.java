package ModelosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Oracle.Conexion;
import java.util.List;
import Modelos.clase;
import java.sql.SQLException;
import java.util.ArrayList;

public class claseDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List<clase>lista = new ArrayList<>();
        String sql = "select * from clases order by ID_CLASE ASC";
        System.out.println("Entre en listar");
        try {
            System.out.println("Entre en el try de listar");
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Entre en el while de listar");
                clase cl = new clase();
                cl.setID_CLASE(rs.getInt(1));
                cl.setLINK_GRABACION(rs.getString(2));
                cl.setCLASE_DESCRIPCION(rs.getString(3));
                lista.add(cl);
            }
        } catch (SQLException e) {
            System.out.println("El error en claseDAo en listar es"  + e);
        }
        return lista;
    }
    
    public int agregar(clase cl){
        int r = 0;
        String sql = "insert into clases(ID_CLASE , LINK_GRABACION , CLASE_DESCRIPCION) values(?,?,?) ";
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getID_CLASE());
            ps.setString(2, cl.getLINK_GRABACION());
            ps.setString(3,cl.getCLASE_DESCRIPCION());
            r = ps.executeUpdate();
            if(r == 1){
                r =1;
            }else{
                r = 0;
            }
            }catch (SQLException e) {
            System.out.println("El error en claseDAO en agregar es" + e);
            }
        return r;
    }
    
    public clase listarId(int ID_CLASE){
        String sql = "select * from clases where ID_CLASE = " + ID_CLASE;
        clase cla = new clase();
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cla.setID_CLASE(rs.getInt(1));
                cla.setLINK_GRABACION(rs.getString(2));
                cla.setCLASE_DESCRIPCION(rs.getString(3));
            }
        } catch (SQLException e) {
            System.err.println("El error en claseDAO en listarId es = " + e);
        }
        return cla;
    }
    public int actualizar(clase cl){
        int r = 0;
        String sql = "update clases set LINK_GRABACION = ? ,  CLASE_DESCRIPCION = ?  where ID_CLASE = ?";
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1,cl.getLINK_GRABACION());
            ps.setString(2, cl.getCLASE_DESCRIPCION());
            ps.setInt(3, cl.getID_CLASE());
            r = ps.executeUpdate();
                if( r == 1){
                    r = 1;
                }else{
                    r = 0;
                }
            } catch (SQLException e) {
                System.err.println("El error en claseDAO en actualizar es = " + e);
            }
        return r;
    }
    public void Borrar (int ID_CLASE){
        String sql = "delete from clases where ID_CLASE = " + ID_CLASE;
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("El error en claseDAO es = " + e);
        }
    }
}
