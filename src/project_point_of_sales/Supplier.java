
package project_point_of_sales;

import java.sql.*;
import javax.swing.JOptionPane;


public class Supplier {
    private String id_Supplier,nama,alamat,telepon;
    koneksi kn = new koneksi();
    Connection con = kn.getKoneksi();
    private boolean pesan = false;

    public String getId_Supplier() {
        return id_Supplier;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setId_Supplier(String id_Supplier) {
        this.id_Supplier = id_Supplier;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public void displaySupplier(){
        System.out.println("Nama Supplier   :"+this.nama);
        System.out.println("No. Telepon     :"+this.telepon);
        System.out.println("Alamat          :"+this.alamat);
    }
    
    public void simpan(){
        try{
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "INSERT INTO supplier(nama_supplier,no_telp,alamat_supplier) VALUES ('"+this.nama+"','"+this.telepon+"','"+this.alamat+"')";
            stmt.executeUpdate(sql);
            this.pesan = true;
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public boolean isPesan(){
        return pesan;
    }
}
