/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import project_point_of_sales.koneksi;

/**
 *
 * @author ASUS
 */
public class display {
    koneksi kn = new koneksi();
    Connection kon = kn.getKoneksi();
    
    public void Display_dataBarang(JTable jtable){
        
        try{
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "Select * FROM data_barang";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id_barang"));
                String nama_Produk = rs.getString("nama_Barang");
                String harga_Jual = String.valueOf(rs.getInt("harga_jual"));
                
                String tbData[] = {id,nama_Produk,harga_Jual};
                
                DefaultTableModel tblModel = (DefaultTableModel) jtable.getModel();
                tblModel.addRow(tbData);
            }
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
}
