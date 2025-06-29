/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_oop;

import java.sql.DriverManager;
import java.sql.Connection;    
import java.sql.SQLException;

/**
 *
 * @author Tangkas
 * @date 15 Juni 2025
 */
public class dbkoneksi {
    
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost:3306/db_laundry"; 
    static String DB_USER = "root";
    static String DB_PASS = "";
    static Connection konek;
    
    public static Connection koneksi() {
        try {
            Class.forName(JDBC_DRIVER);
            konek = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Koneksi berhasil ke database!");
            return konek;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Terjadi kesalahan koneksi ke database: " + e.getMessage());
            return null;
        }
    }
}
