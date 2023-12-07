package ModelosDAO;

import Modelos.presentaciones;
import Oracle.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class presentacionesDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List<presentaciones>lista = new ArrayList<>();
        String sql = "select * from presentaciones order by ID_PRESENTACION ASC";
        System.out.println("Entre en presentaciones DAO metodo listar \n");
        try {
            System.out.println("Entre al try");
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(" entre al while \n");
                presentaciones pre = new presentaciones();
                pre.setId_presentacion(rs.getString(1));
                pre.setPowerpoint(rs.getString(2));
                pre.setPresen_descripcion(rs.getString(3));
                lista.add(pre);
            }
        } catch (SQLException e) {
            System.out.println("El error en listar de presentacionesDAO es: " + e);
        }
        return lista;
    }
    public int agregar(presentaciones pre){
        int r=0;
        String sql="insert into presentaciones(ID_PRESENTACION , LINK_POWERPOINT , PRESEN_DESCRIPCION)values(?,?,?)";
        try {
            con = c.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, pre.getId_presentacion());
            ps.setString(2, pre.getPowerpoint());
            ps.setString(3, pre.getPresen_descripcion());
            r = ps.executeUpdate();
            if(r == 1){
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error en el presentaciones DAO es : " + e);
        }
        return r;
    }
    
    public presentaciones listarId(String Id_presentacion){
        String sql = "select * from presentaciones where ID_PRESENTACION = " + Id_presentacion;
        presentaciones pre = new presentaciones();
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pre.setId_presentacion(rs.getString(1));
                pre.setPowerpoint(rs.getString(2));
                pre.setPresen_descripcion(rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println("el error en presentacionesDao en Listar ID es:" + e);
        }
        return pre;
    }
    public int actualizar(presentaciones pre){
        int r = 0;
        String sql = "update presentaciones set LINK_POWERPOINT = ? , PRESEN_DESCRIPCION = ? where ID_PRESENTACION = ?";
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, pre.getPowerpoint());
            ps.setString(2,pre.getPresen_descripcion());
            ps.setString(3, pre.getId_presentacion());
            r = ps.executeUpdate();
            if(r == 1){
                r = 1;
            }else{
                r = 0;
            }
        } catch (SQLException e) {
            System.out.println("El error en presentacionDAO en Actualizar es:" + e);
        }
        return r;
    }
    
    public void delete(String Id_presentacion){
        String sql = "delete from presentaciones where ID_PRESENTACION = " + Id_presentacion;
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("El error en delete de presentacionesDAO es = " + e);
        }
    }
}
