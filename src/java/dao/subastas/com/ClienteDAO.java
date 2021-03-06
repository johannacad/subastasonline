/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.subastas.com;

import conexion.subastas.com.Conexion;
import entidades.subastas.com.Cliente;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author Johanna
 */
public class ClienteDAO {
    private static Connection conexion = Conexion.getConnection();
    
    public void guardar(Cliente cliente) {
        CallableStatement stmt = null;
        try {
            String query = "{CALL sp_guardar_cliente(?, ?, ?, ?, ?, ?)}";
            stmt = conexion.prepareCall(query);
            stmt.setString(1, cliente.getDni());
            stmt.setString(2, cliente.getNombres());
            stmt.setString(3, cliente.getApellidoPaterno());
            stmt.setString(4, cliente.getApellidoMaterno());
            stmt.setString(5, cliente.getEmail());
            stmt.setString(6, cliente.getFechaNacimiento());
                        
            stmt.executeUpdate();
            System.out.println("ClienteDAO.guardar(): El registro fue guardado en la base de datos");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();                    
                } catch (Exception e) {
                    System.err.println("Error intentando cerrar el CallableStatement:\n" + e.getLocalizedMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
