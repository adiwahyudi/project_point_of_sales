/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_point_of_sales;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class koneksi {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String host = "jdbc:mysql://localhost:3306/data_barang";
    private String user = "root";
    private String pass = "";
    private Connection koneksi;

    /**
     * @return the koneksi
     */
    public Connection getKoneksi() {
        //Connect ke koneksi
        try {
            Class.forName(driver);
        }catch(ClassNotFoundException ce){
            JOptionPane.showMessageDialog(null, ce+"Gagal Connect ke driver");
        }
        
        //Connect ke database;
        try{
            koneksi = DriverManager.getConnection(host,user,pass);
        }catch(SQLException ce){
            JOptionPane.showMessageDialog(null, ce+"Gagal Connect ke database");
        }
        return koneksi;
    }

    /**
     * @param koneksi the koneksi to set
     */
    public void setKoneksi(Connection koneksi) {
        this.koneksi = koneksi;
    }
    
}
