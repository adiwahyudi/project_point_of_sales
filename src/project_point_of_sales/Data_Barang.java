
package project_point_of_sales;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Data_Barang {
//    private int id_Barang=1;
    private String nama_Barang,kategori;
    private int harga_jual,harga_beli;
    private boolean pesan = false;
    koneksi kn = new koneksi();
    Connection kon = kn.getKoneksi();

//    public int getId_Barang() {
//        return id_Barang;
//    }

    public String getNama_Barang() {
        return nama_Barang;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHarga_jual() {
        return harga_jual;
    }

    public int getHarga_beli() {
        return harga_beli;
    }


    public void setNama_Barang(String nama_Barang) {
        this.nama_Barang = nama_Barang;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }

    public void setHarga_beli(int harga_beli) {
        this.harga_beli = harga_beli;
    }

    public boolean isPesan() {
        return pesan;
    }
    
    
    public void simpan(){
        try{
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "INSERT INTO data_barang(nama_Barang,kategori,harga_jual,harga_beli) VALUES ('"+this.nama_Barang+"','"+this.kategori+"',"+this.harga_jual+","+this.harga_beli+")";
            stmt.executeUpdate(sql);
            this.pesan = true;
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }

    public void displayDataBarang(){
//        System.out.println("ID Barang           :" + this.id_Barang);
        System.out.println("Nama Barang         :" + this.nama_Barang);
        System.out.println("Kategori            :" + this.kategori);
        System.out.println("Harga Jual          :" + this.harga_jual);
        System.out.println("Harga Beli          :" + this.harga_beli);
    }
}
