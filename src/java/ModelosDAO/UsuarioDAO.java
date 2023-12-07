package ModelosDAO;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelos.Usuario;
import Oracle.Conexion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class UsuarioDAO {

    Connection con; //Conectarnos con la bd
    Statement st; //Establce la conexion
    ResultSet rs; //Resultados de las consultas
    PreparedStatement ps; //Enviar consultas
    Conexion cn = new Conexion();

    public boolean registrarUsuario(Usuario usuario) {
        String consulta = "Insert into usuarios (id_usuario,contrasenia,us_nombre,us_apellido,us_segApellido,correo,codigo_perfil) values (?,?,?,?,?,?,?)";
        try {
            
            con = cn.Conectar();
            st = con.createStatement(); //Se crea la conexion
            ps = con.prepareStatement(consulta); //Prepara la consulta
            ps.setInt(1, usuario.getId_usuario());
            ps.setString(2, usuario.getContrasenia());
            ps.setString(3, usuario.getCc_nombre());
            ps.setString(4, usuario.getCc_apellido());
            ps.setString(5, usuario.getCc_segApellido());
            ps.setString(6, usuario.getCorreo());
            ps.setInt(7, usuario.getCodigo_perfil());
            int r = ps.executeUpdate();
            if (r == 1) 
            {
                ps.close();
                con.close();
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            //JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

     public Usuario inicioSesion(String correo, String pass) {
        String consulta = "select * from USUARIOS where correo = ? and contrasenia = ?";
        Usuario us = null;
        try {
            con = cn.Conectar();
            st = con.createStatement(); //Se crea la conexion
            ps = con.prepareStatement(consulta); //Prepara la consulta
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                us = new Usuario();
                us.setId_usuario(rs.getInt(1));
                us.setContrasenia(rs.getString(2));
                us.setCc_nombre(rs.getString(3));
                us.setCc_apellido(rs.getString(4));
                us.setCc_segApellido(rs.getString(5));
                us.setCorreo(rs.getString(6));
                us.setCodigo_perfil(rs.getInt(7));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return us;
    }
    public List listar(){
        List<Usuario>lista = new ArrayList<>();
        String sql = "select * from usuarios order by ID_USUARIO ASC";
        System.out.println("Entre en listar en UsuarioDAO");
        try {
            System.out.println("Entre en listar en UsuarioDAO en try");
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Entre en listar en UsuarioDAO el while");
                Usuario us = new Usuario();
                us.setId_usuario(rs.getInt(1));
                us.setContrasenia(rs.getString(2));
                us.setCc_nombre(rs.getString(3));
                us.setCc_apellido(rs.getString(4));
                us.setCc_segApellido(rs.getString(5));
                us.setCorreo(rs.getString(6));
                us.setCodigo_perfil(rs.getInt(7));
                lista.add(us);
                System.out.println("Soy UsuarioDAO = "+us);
            }
        } catch (SQLException e) {
            System.err.println("El error en UsuarioDAO en Listar es = " + e);
        }
        return lista;
    }
    
    public int agregar(Usuario us) {
        int r = 0;
        String sql = "insert into usuarios (ID_USUARIO , CONTRASENIA , US_NOMBRE , US_APELLIDO , US_SEGAPELLIDO , CORREO , CODIGO_PERFIL) values(? , ? , ? , ? , ? , ?, ?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, us.getId_usuario());
            ps.setString(2, us.getContrasenia());
            ps.setString(3, us.getCc_nombre());
            ps.setString(4, us.getCc_apellido());
            ps.setString(5, us.getCc_segApellido());
            ps.setString(6, us.getCorreo());
            ps.setInt(7, us.getCodigo_perfil());
            r = ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (SQLException e) {
            System.err.println("El error en agregar de UsuarioDAO es = " + e);
        }
        return r;
    }
    public Usuario listarId(int ID_USUARIO){
        String sql = "select * from usuarios where ID_USUARIO =" + ID_USUARIO;
        Usuario us = new Usuario();
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                us.setId_usuario(rs.getInt(1));
                us.setContrasenia(rs.getString(2));
                us.setCc_nombre(rs.getString(3));
                us.setCc_apellido(rs.getString(4));
                us.setCc_segApellido(rs.getString(5));
                us.setCorreo(rs.getString(6));
                us.setCodigo_perfil(rs.getInt(7));
                
            }
        } catch (SQLException e) {
            System.err.println("El error en UsuarioDAO en listarID es = " + e);
        }
        return us;
    }
    public int actualizar(Usuario us) {
        int r = 0;
        String sql = "update usuarios set CONTRASENIA = ? , US_NOMBRE = ? , US_APELLIDO = ? , US_SEGAPELLIDO = ? , CORREO = ? , CODIGO_PERFIL = ? where ID_USUARIO = ?";

        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getContrasenia());
            ps.setString(2, us.getCc_nombre());
            ps.setString(3, us.getCc_apellido());
            ps.setString(4, us.getCc_segApellido());
            ps.setString(5, us.getCorreo());
            ps.setInt(6, us.getCodigo_perfil());
            ps.setInt(7, us.getId_usuario());
            r = ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (SQLException e) {
            System.err.println("El error en actualizar de UsuarioDAO es = " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }
    
    public void Borrar (int ID_USUARIO){
        String sql = "delete from usuarios where ID_USUARIO = " + ID_USUARIO;
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("El error en usuarioDAO en Borrar es" + e);
        }
    }
}
