package Oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Conexion {

    public static Connection obtenerConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // --- el url es la conexion con oracle y el driver jdbc, el puerto por lo general es 1521
    String user = "admi_siic";
    String pass = "123";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String driver = "oracle.jdbc.driver.OracleDriver";
    Connection con = null;

    public Connection Conectar() {
        try {
            Class.forName(driver);
            try {
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Se conecto");
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
                System.out.println("NO conecto");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
