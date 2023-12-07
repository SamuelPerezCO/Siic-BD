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
import Modelos.PreCla;
/**
 *
 * @author Juan Pablo
 */
public class PreClaDAO {
    
        
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List<PreCla> lista = new ArrayList<>();
        String sql = "select * from presentaciones_clases order by ID_PRES_CLA ASC";
        try {
            //System.out.println("entro el try ");
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {  
                //System.out.println("entro al while");
                PreCla pc = new PreCla();
                pc.setId_pres_cla(rs.getInt(1));
                pc.setCodigo_clase(rs.getInt(2));
                pc.setCodigo_presen(rs.getInt(3));
                lista.add(pc);                
            }
        } catch (SQLException e) {
            System.out.println("el error" + e);
        }
        return lista;
    }
    
    public int agregar(PreCla pc){
        int r = 0;
        String sql="insert into presentaciones_clases (id_pres_cla, codigo_clase, codigo_pres) values(?,?,?)";
        try {
            con=c.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, pc.getId_pres_cla());
            ps.setInt(2, pc.getCodigo_clase());
            ps.setInt(3, pc.getCodigo_presen());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error es en agregar en presentaciones clase: " + e);
        }return r;
    }
    
    public PreCla listarId(int id){
        String sql = "select * from presentaciones_clases where id_pres_cla=" + id;
        PreCla pc = new PreCla();
        try {
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pc.setId_pres_cla(rs.getInt(1));
                pc.setCodigo_clase(rs.getInt(2));
                pc.setCodigo_presen(rs.getInt(3));                
            }
        } catch (SQLException e) {
            System.err.println("El error en listarId de PreClaDAO es =" + e);
        }
        return pc;
    }
    
    public int modificar(PreCla pc){
        int r = 0;
        String sql = "update presentaciones_clases set codigo_clase=?, codigo_pres=? where id_pres_cla=?";
        try {
            con=c.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, pc.getCodigo_clase());
            ps.setInt(2, pc.getCodigo_presen());
            ps.setInt(3, pc.getId_pres_cla());
            r=ps.executeUpdate();
            if (r==1) {
                r=1;
            }else{
                r=0;
            }
        } catch (SQLException e) {
            System.out.println("El error es : " + e);
        }return r;
    }
    public void borrar(int id){
        String sql = "delete from presentaciones_clases where id_pres_cla="+id;
        try {
            con=c.Conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();            
        } catch (SQLException e) {
            System.err.println("El error en borrar de PreClaDAO es =" + e);
        }
       
    }
    
}
