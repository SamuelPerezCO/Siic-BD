/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelosDAO;

import Modelos.VistaPC;
import Oracle.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Pablo
 */
public class vistaPC_DAO {
    
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    
    public List listar(){
        List<VistaPC>lista = new ArrayList<>();
        String sql = "select * from vista_presentaciones_en_clase";
        System.out.println("Entre en vistaUC DAO metodo listar \n");
        try {
            System.out.println("Entre al try");
            con = c.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(" entre al while \n");
                VistaPC v = new VistaPC();
                v.setId_pres_cla(rs.getInt(1));
                v.setClase_descripcion(rs.getString(2));
                v.setPresen_descripcion(rs.getString(3));
                lista.add(v);
            }
        } catch (Exception e) {
            System.out.println("El error en listar de presentacionesDAO es: " + e);
        }
        return lista;
    }
    
}
