/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import project_point_of_sales.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class display {
    koneksi kn = new koneksi();
    Connection kon = kn.getKoneksi();
    
    
    public void Display_dataBarang(JTable jtable){
        
        try{
            DefaultTableModel tblModel = (DefaultTableModel) jtable.getModel();
            tblModel.setRowCount(0);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "Select * FROM data_barang";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id_barang"));
                String nama_Produk = rs.getString("nama_Barang");
                String kategori = rs.getString("kategori");
                String harga_Jual = String.valueOf(rs.getInt("harga_jual"));
                String harga_Beli = String.valueOf(rs.getInt("harga_beli"));
                String tbData[] = {id,nama_Produk,kategori,harga_Jual,harga_Beli};
                tblModel.addRow(tbData);
            }
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
    
    public void Display_detailBelanja(JTable jtable,String id_transaksi){
        
        try{
            DefaultTableModel tblModel = (DefaultTableModel) jtable.getModel();
            tblModel.setRowCount(0);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT * FROM data_detailbelanja WHERE id_transaksi='"+id_transaksi+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id_barang"));
                String nama_Produk = rs.getString("nama_Barang");
                String kategori = rs.getString("kategori");
                String harga_Jual = String.valueOf(rs.getInt("harga_jual"));
                String jumlah_Item = String.valueOf(rs.getInt("jumlah_item"));
                String harga_total = String.valueOf(rs.getInt("harga_total"));
                String tbData[] = {id,nama_Produk,kategori,harga_Jual,jumlah_Item,harga_total};
                
                tblModel.addRow(tbData);
            }
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
    
    public void search_IDTable(JTable jtable,String id){
        
        try{
            int idB = Integer.parseInt(id);
            DefaultTableModel tblModel = (DefaultTableModel) jtable.getModel();
            tblModel.setRowCount(0);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "Select * FROM data_barang WHERE id_barang ='"+idB+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()){
                if (id.equals(rs.getString("id_barang"))){
                    String id2 = String.valueOf(rs.getInt("id_barang"));
                    String nama_Produk = rs.getString("nama_Barang");
                    String kategori = rs.getString("kategori");
                    String harga_Jual = String.valueOf(rs.getInt("harga_jual"));
                    String tbData[] = {id2,nama_Produk,kategori,harga_Jual};
                    tblModel.addRow(tbData);
                }
            }
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
    
    
    public Data_Barang search_ID(String id){
        
        try{
            int idB = Integer.parseInt(id);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "Select * FROM data_barang WHERE id_barang ='"+idB+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()){
                if (id.equals(rs.getString("id_barang"))){
                    Data_Barang info = new Data_Barang(rs.getInt("id_barang"),rs.getString("nama_Barang"),rs.getString("kategori"),rs.getInt("harga_jual"),rs.getInt("harga_beli"));
                    return info;
                }
            } else {
                JOptionPane.showMessageDialog(null,"Item tidak tersedia");
                return null;
            }
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
        return null;
    }
    
//    public void add_Keranjang(String id, String nama,String kategori, String hargaJ, String jumlahB){
//        
////        try{
////            int idB = Integer.parseInt(id);
////            int hargaJual = Integer.parseInt(hargaJ);
////            int jumlah = Integer.parseInt(jumlahB);
////            int total = hargaJual*jumlah;
////            Statement stmt = (Statement) kn.getKoneksi().createStatement();
////            String sql = "INSERT INTO data_detailbelanja VALUES ('"+idB+"','"+nama+"','"+kategori+"',"+hargaJual+","+jumlah+","+total+")";
////            stmt.executeUpdate(sql);
////        }catch(SQLException sqle){
////            System.out.println(sqle);
////            JOptionPane.showMessageDialog(null,"gagal memasukkan item");
////        }
//        try {
//            PreparedStatement stmt = kn.getKoneksi().prepareStatement("INSERT INTO transaksi(id_cashier,id_customer,total,waktu,pembayaran) VALUES (?,?,?,?,?)");            
//            stmt.setString(1,id_cashier);
//            stmt.setString(2,id_customer);
//            stmt.setInt(3, total);
//            stmt.setString(4,waktu);
//            stmt.setString(5, pembayaran);
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null,"Transaksi Sukses");
//        } catch (SQLException sqle) {
//            System.out.println(sqle.getMessage());
//            JOptionPane.showMessageDialog(null,"Transaksi Gagal");
//        }
//    }
    
    public void add_Keranjang(String id_transaksi,String id_barang,String nama_barang,String kategori,String harga_jual,String jumlah_item) {
        try {
            PreparedStatement stmt = kn.getKoneksi().prepareStatement("INSERT INTO data_detailbelanja(id_transaksi,id_barang,nama_barang,kategori,harga_jual,jumlah_item,harga_Total) VALUES (?,?,?,?,?,?,?)");            
            stmt.setString(1,id_transaksi);
            stmt.setString(2,id_barang);
            stmt.setString(3, nama_barang);
            stmt.setString(4,kategori);
            stmt.setString(5, harga_jual);
            int hargaJual = Integer.parseInt(harga_jual);
            int jumlah = Integer.parseInt(jumlah_item);
            int total = hargaJual*jumlah;
            stmt.setString(6, jumlah_item);
            stmt.setInt(7, total);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Keranjang berhasil di tambah");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            JOptionPane.showMessageDialog(null,"Keranjang gagal di tambah");
        }
    }
    
    public void update_Keranjang(String id,String hargaJ, String jumlahB){
        
        try{
            int idB = Integer.parseInt(id);
            int hargaJual = Integer.parseInt(hargaJ);
            int jumlah = Integer.parseInt(jumlahB);
            int total = hargaJual*jumlah;
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "UPDATE data_detailbelanja SET jumlah_item = "+jumlah+",harga_Total ="+total+" WHERE id_barang ='"+idB+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"item sudah diupdate");
        }catch(SQLException sqle){
            System.out.println(sqle);
            JOptionPane.showMessageDialog(null,"item sudah dimasukkan");
        }
    }
    
    public void delete_Keranjang(String id){
        
        try{
            int idB = Integer.parseInt(id);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "DELETE FROM data_detailbelanja WHERE id_barang ='"+idB+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"item telah dihapus");
        }catch(SQLException sqle){
            System.out.println(sqle);
            JOptionPane.showMessageDialog(null,"item sudah dimasukkan");
        }
    }
    
    
    public void delete_Barang(String id){
        
        try{
            int idB = Integer.parseInt(id);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "DELETE FROM data_barang WHERE id_barang ='"+idB+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"item telah dihapus");
        }catch(SQLException sqle){
            System.out.println(sqle);
            JOptionPane.showMessageDialog(null,"item sudah dimasukkan");
        }
    }
    
    
    public void update_Barang(String id, String hargaJ, String jumlahB){
        try{
            int idB = Integer.parseInt(id);
            int hargaJual = Integer.parseInt(hargaJ);
            int hargaBeli = Integer.parseInt(jumlahB);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "UPDATE data_barang SET harga_jual = "+hargaJual+",harga_beli ="+hargaBeli+" WHERE id_barang ='"+idB+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"item sudah diupdate");
        } catch(SQLException sqle){
            System.out.println(sqle);
            JOptionPane.showMessageDialog(null,"item sudah dimasukkan");
        }
    }
    
    public boolean cashier_login(String username,String password) {
 
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT * FROM cashier WHERE username ='"+username+"' AND password='"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()){
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
//                    id_cashier = rs.getInt("id");
//                    System.out.println("id cashier display : "+id_cashier);
                    Cashier cashier_info = new Cashier(rs.getString("id"), rs.getString("username"), rs.getString("password"), rs.getString("nama"), rs.getString("kode"));
                    Frame_Cashier_Menu cm = new Frame_Cashier_Menu(cashier_info);
                    JOptionPane.showMessageDialog(null,"Login Berhasil");
                    cm.setVisible(true);
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null,"Username atau Passsword salah");
                return false;
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null,sqle.getMessage());
            return false;
        }
        return false;
    }
    
    public void add_customer(String username, String nama, String alamat, String dob) {
        try {
            PreparedStatement stmt = kn.getKoneksi().prepareStatement("INSERT INTO customer(username,name,alamat,dob) VALUES (?,?,?,?)");            
            stmt.setString(1,username);
            stmt.setString(2,nama);
            stmt.setString(3, alamat);
            stmt.setString(4,dob);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Berhasil menambahkan Customer");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            JOptionPane.showMessageDialog(null,"Gagal menambahkan Customer");
        }
    }
    
    public void display_customer(JTable JT) {
        try{
            DefaultTableModel tblModel = (DefaultTableModel) JT.getModel();
            tblModel.setRowCount(0);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT * FROM customer";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String username = rs.getString("username");
                String name = rs.getString("name");
                String alamat = rs.getString("alamat");
                String dob = rs.getString("dob");
                String tbData[] = {id,username,name,alamat,dob};
                tblModel.addRow(tbData);
            }
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
    
    public void update_customer(String id, String username,String nama, String alamat, String dob){
        try {
            PreparedStatement stmt = kn.getKoneksi().prepareStatement("UPDATE customer set username=?,name=?,alamat=?,dob=? WHERE id=?");   
            stmt.setString(1,username);
            stmt.setString(2,nama);
            stmt.setString(3,alamat);
            stmt.setString(4,dob);
            stmt.setString(5,id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Berhasil mengupdate Customer");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            JOptionPane.showMessageDialog(null,"Gagal mengupdate Customer");
        }
    }
    
    public void delete_customer(int id) {
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "DELETE FROM customer WHERE id ='"+id+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Berhasil menghapus Customer");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            JOptionPane.showMessageDialog(null,"Gagal menghapus Customer");
        }
    }
    
    public String get_id_trans_now(){
        String id = null;
        try{
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT COUNT(id) FROM transaksi";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                int int_id = rs.getInt("COUNT(id)") + 1;
                id = String.valueOf(int_id);
            }
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return id;
    }
    
    public void create_transaction(String id_cashier,String id_customer,int total,String waktu,String pembayaran){
        try {
            PreparedStatement stmt = kn.getKoneksi().prepareStatement("INSERT INTO transaksi(id_cashier,id_customer,total,waktu,pembayaran) VALUES (?,?,?,?,?)");            
            stmt.setString(1,id_cashier);
            stmt.setString(2,id_customer);
            stmt.setInt(3, total);
            stmt.setString(4,waktu);
            stmt.setString(5, pembayaran);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Transaksi Sukses");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            JOptionPane.showMessageDialog(null,"Transaksi Gagal");
        }
    }
    
//    public String[] display_cashier_info(int id){
//        String[] info = new String[2];
//        try {
//            Statement stmt = (Statement) kn.getKoneksi().createStatement();
//            String sql = "SELECT username,kode FROM cashier WHERE id ='"+id+"'";
//            ResultSet rs = stmt.executeQuery(sql);
//            String username = rs.getString("username");
//            String kode = rs.getString("kode");
//            info[0] = username;
//            info[1] = kode;
//            System.out.println("rs : "+rs);
//            System.out.println("info : "+info);
//        } catch (SQLException sqle) {
//            System.out.println(sqle.getMessage());
//        }
//        return info;
//    }  
}
