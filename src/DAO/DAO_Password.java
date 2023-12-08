package DAO;

import Modelo.Encriptador;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DAO_Password {

    private ConexionBD conexionBD;

    public DAO_Password() {
        conexionBD = new ConexionBD();
    }

    public void agregarPassword(String sitio, String usuario, String contraseña) {
        try {
            // Generar una clave aleatoria para la encriptación
            String claveAleatoria = Encriptador.generarClaveAleatoria();

            // Encriptar el usuario y la contraseña con la clave aleatoria
            String usuarioEncriptado = Encriptador.encriptar(usuario, claveAleatoria);
            String contraseñaEncriptada = Encriptador.encriptar(contraseña, claveAleatoria);

            // Crear la consulta para insertar los datos en la tabla passwords
            String consulta = "INSERT INTO passwords (sitio, nombre_usuario, contraseña) VALUES (?, ?, ?)";
            PreparedStatement ps = conexionBD.conexion.prepareStatement(consulta);
            ps.setString(1, sitio);
            ps.setString(2, usuarioEncriptado);
            ps.setString(3, contraseñaEncriptada);

            // Ejecutar la consulta para insertar los datos en la base de datos
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar la contraseña: " + e.getMessage());
        }
    }

    //***************************
    public static DefaultTableModel obtenerDatosTabla() {
        String[] titulos = {"Sitio", "Usuario", "Contraseña"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        try {
            ConexionBD conexionBD = new ConexionBD();
            // Aquí realiza la consulta para obtener los datos de la base de datos
            String consulta = "SELECT sitio, nombre_usuario, contraseña FROM passwords";
            PreparedStatement ps = conexionBD.conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sitio = rs.getString("sitio");
                String usuarioEncriptado = rs.getString("nombre_usuario");
                String contraseñaEncriptada = rs.getString("contraseña");

                modelo.addRow(new Object[]{sitio, usuarioEncriptado, contraseñaEncriptada});
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los datos: " + e.getMessage());
        }

        return modelo;
    }

}
