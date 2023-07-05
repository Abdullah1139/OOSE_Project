/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author Hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    public static Connection getConnection() {
        Connection conn = null;

        try {
            // db parameters
            String url = "jdbc:oracle:thin:@//localhost:1521/hmspdb";
            String username = "hms_dba";
            String password = "hms123";

            // create a connection to the database
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to hmspdb has been established.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }

        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection to hmspdb has been closed.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to close the database connection: " + e.getMessage());
            //this is for a insertion process
        }
    }
}
