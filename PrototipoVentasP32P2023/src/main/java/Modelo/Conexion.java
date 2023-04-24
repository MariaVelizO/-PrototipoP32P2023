/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   package Modelo;

import java.sql.*;

/**
 *
 * @author maria
 */


public class Conexion {
private static final String JDBC_URL = "jdbc:mysql://localhost/prototipop32p2023?useSSL=false&serverTimezone=UTC";    
    private static final String JDBC_USER = "UsuPrueba";
    private static final String JDBC_PASS = "123456";
   
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
}
