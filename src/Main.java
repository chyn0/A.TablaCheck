
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JEN
 */
public class Main {
    public static Conexion conexion = new Conexion();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        
        System.out.println("Conectado: "+conexion.crearConexion());
        if(conexion.crearConexion()){
            Form f = new Form();
            f.setVisible(true);
        }
    }
}
