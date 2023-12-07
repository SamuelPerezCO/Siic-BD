/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelosDAO;

/**
 *
 * @author Juan Pablo
 */
import Modelos.Perfiles;
import Oracle.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PerfilesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection conP;
    
    public List listar(){
        List<Perfiles> lista = new ArrayList<>();
        String sql = "select * from perfiles order by ID_PERFIL ASC";
        try {
            conP = c.Conectar();
            ps = conP.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Perfiles p = new Perfiles();
                p.setId_perfil(rs.getInt(1));
                p.setDescripcion_perfil(rs.getString(2));
                p.setCodigo_rol(rs.getInt(3));
                p.setCodigo_permiso(rs.getInt(4));
                lista.add(p);
                
            }
        } catch (SQLException e) {
            System.err.println("El error al listar en perfiles es  = " + e);
        }
        return lista;
    }
    
    public int agregar(Perfiles p){
        int r = 0;
        String sql="insert into PERFILES (id_perfil, descripcion_perfil, codigo_rol, codigo_permiso) values(?,?,?,?)";
        try {
            conP=c.Conectar();
            ps=conP.prepareStatement(sql);
            ps.setInt(1, p.getId_perfil());
            ps.setString(2, p.getDescripcion_perfil());
            ps.setInt(3, p.getCodigo_rol());
            ps.setInt(4, p.getCodigo_permiso());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error al agregar perfiles esta en : " + e);
        }
            return r;
    }
    
     public Perfiles listarId(int id){
        String sql = "select * from PERFILES where id_perfil=" + id;
        Perfiles p = new Perfiles();
        try {
            conP = c.Conectar();
            ps = conP.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId_perfil(rs.getInt(1));
                p.setDescripcion_perfil(rs.getString(2));
                p.setCodigo_rol(rs.getInt(3));
                p.setCodigo_permiso(rs.getInt(4));
            }
        } catch (SQLException e) {
            System.out.println("El error en listarID en perfiles es :" + e);
        }
        return p;
    }
     
    public int modificar(Perfiles p){
        int r = 0;
        String sql = "update PERFILES set descripcion_perfil = ?, codigo_rol = ?, codigo_permiso = ? where id_permiso=?";
        try {
            conP=c.Conectar();
            ps=conP.prepareStatement(sql);
            ps.setString(1, p.getDescripcion_perfil());
            ps.setInt(2, p.getCodigo_rol());
            ps.setInt(3, p.getCodigo_permiso());
            ps.setInt(4, p.getId_perfil());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error en modificar de Perfiles es : " + e);
        }
return r;
    }
    
    public void borrar(int id){
        System.out.println("entro en borrar perfil");
        String sql = "delete from PERFILES where id_perfil="+id;
        try {
            System.out.println("entro al try de borrar perfil");
            conP=c.Conectar();
            ps=conP.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("termino borrar perfil");
        } catch (SQLException e) {
            System.out.println("El error en borrar de perfiles es: " + e);
        }
       
    }
    
}
