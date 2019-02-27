/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion.subastas.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Johanna
 */
public class Conexion {
    
    public static Connection conexion = null;
    
    public static Connection getConnection() {
        if (conexion == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost;databaseName=traductorDB;user=sa;password=alumno;";
                conexion = DriverManager.getConnection(url);
            } catch (ClassNotFoundException e) {
                conexion = null;
            } finally {
                return conexion;
            }            
        }
        return conexion;
    }
    
    public static void closeConnection() {
        if (conexion != null) {
            try {
                conexion.close();                
            } catch (SQLException e) {
                System.err.println("Error intentando cerrar la conexion:\n" + e.getLocalizedMessage());
            }
        }
    }
}
