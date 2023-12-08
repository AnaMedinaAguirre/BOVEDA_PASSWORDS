package DAO;

import java.sql.*;

public class ConexionBD implements Parametros{
    
    public Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    
    public ConexionBD() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
            st = conexion.createStatement();
        } catch (Exception e) {
            System.out.println("ERROR, no se puede conectar a la BD..." + e);
        }
    }
}
