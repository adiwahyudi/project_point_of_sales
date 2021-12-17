
package project_point_of_sales;


public class Data_Barang {
    private String id_Barang,nama_Barang,kategori;
    private int harga_jual,harga_beli;

    public String getId_Barang() {
        return id_Barang;
    }

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

    public void setId_Barang(String id_Barang) {
        this.id_Barang = id_Barang;
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
    
    public void displayDataBarang(){}
}
