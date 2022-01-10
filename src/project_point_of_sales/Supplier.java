
package project_point_of_sales;


public class Supplier {
    private String id_Supplier,nama,alamat,telepon;

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
        
    }
}
