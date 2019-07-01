package database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chron
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection conn;
    
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
    private DatabaseConnectionManager(){
        
    }
    
    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }
    
    /**
     * contains connection details
     * 
     * @throws SQLException
     */
    public void connect() throws SQLException {
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Connection Established...");
    }
    
    public Connection getConnectionObject(){
        return conn;
    }
    
    public void disconnect() throws SQLException {
        conn.close();
        System.out.println("Disconnected from database...");
    }
}
