/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelosDAO;

import Oracle.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelos.Roles;

/**
 *
 * @author Juan Pablo
 */
public class RolDAO {
    
        
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List<Roles> lista = new ArrayList<>();
        String sql = "select * from ROLES order by ID_ROL ASC";
        try {
            //System.out.println("entro el try ");
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {  
                //System.out.println("entro al while");
                Roles rol = new Roles();
                rol.setId_rol(rs.getInt(1));
                rol.setNombre_rol(rs.getString(2));
                lista.add(rol);                
            }
        } catch (SQLException e) {
            System.out.println("el error en RolDAO en Listar es = " + e);
        }
        return lista;
    }
    
    public int agregar(Roles rol){
        int r = 0;
        String sql="insert into ROLES (id_rol, nombre_rol) values(?,?)";
        try {
            con=c.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, rol.getId_rol());
            ps.setString(2, rol.getNombre_rol());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error en en RolDAO en agregar es : " + e);
        }
return r;
    }
    
    public Roles listarId(int id){
        String sql = "select * from ROLES where id_rol=" + id;
        Roles rol = new Roles();
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rol.setId_rol(rs.getInt(1));
                rol.setNombre_rol(rs.getString(2));
                
            }
        } catch (SQLException e) {
            System.err.println("El error en listarId es de RolDAO es = " + e);
        }
        return rol;
    }
    
    public int modificar(Roles rol){
        int r = 0;
        String sql = "update Roles set nombre_rol=? where id_rol=?";
        try {
            con=c.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, rol.getNombre_rol());
            ps.setInt(2, rol.getId_rol());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El Error en modificar de RolDAO es : " + e);
        }
return r;
    }
    public void borrar(int id){
        String sql = "delete from ROLES where id_rol="+id;
        try {
            con=c.Conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();            
        } catch (SQLException e) {
            System.err.println("El error en borrar de RolDAO es = " + e);
        }
       
    }
    
}
