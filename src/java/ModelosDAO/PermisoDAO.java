/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelosDAO;

/**
 *
 * @author serna
 */
import Modelos.Permisos;
import Oracle.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Pablo
 */
public class PermisoDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection conP;
    
    public List listar(){
        List<Permisos> lista = new ArrayList<>();
        String sql = "select * from permisos order by ID_PERMISO ASC";
        try {
            conP = c.Conectar();
            ps = conP.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Permisos p = new Permisos();
                p.setId_permiso(rs.getInt(1));
                p.setDetalle_permiso(rs.getString(2));
                lista.add(p);
                
            }
        } catch (SQLException e) {
            System.err.println("El error en PermisoDAO es  = " + e);
        }
        return lista;
    }
    
    public int agregar(Permisos p){
        int r = 0;
        String sql="insert into PERMISOS (id_permiso, detalle_permiso) values(?,?)";
        try {
            conP=c.Conectar();
            ps=conP.prepareStatement(sql);
            ps.setInt(1, p.getId_permiso());
            ps.setString(2, p.getDetalle_permiso());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error en PermisoDAO en agregar es : " + e);
        }
            return r;
    }
    
     public Permisos listarId(int id){
        String sql = "select * from PERMISOS where id_permiso=" + id;
        Permisos p = new Permisos();
        try {
            conP = c.Conectar();
            ps = conP.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId_permiso(rs.getInt(1));
                p.setDetalle_permiso(rs.getString(2));
                
            }
        } catch (SQLException e) {
            System.out.println("El error en listarID de PermisoDAO es :" + e);
        }
        return p;
    }
     
    public int modificar(Permisos p){
        int r = 0;
        String sql = "update PERMISOS set detalle_permiso=? where id_permiso=?";
        try {
            conP=c.Conectar();
            ps=conP.prepareStatement(sql);
            ps.setString(1, p.getDetalle_permiso());
            ps.setInt(2, p.getId_permiso());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error en modificar de PermisoDAO es : " + e);
        }
return r;
    }
    
    public void borrar(int id){
        System.out.println("entro en borrar permiso");
        String sql = "delete from PERMISOS where id_permiso="+id;
        try {
            System.out.println("entro al try de borrar permiso");
            conP=c.Conectar();
            ps=conP.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("termino borrar permiso");
        } catch (SQLException e) {
            System.out.println("El error en borrar en PermisoDAO" + e);
        }
       
    }
    
}

