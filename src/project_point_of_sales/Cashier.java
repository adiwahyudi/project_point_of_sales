
package project_point_of_sales;


public class Cashier {
    private String nama_kasir,kode_kasir;
    
    public Cashier(String nama,String kode){
        this.nama_kasir = nama;
        this.kode_kasir = kode;
    }

    public void setNama_kasir(String nama_kasir) {
        this.nama_kasir = nama_kasir;
    }

    public void setKode_kasir(String kode_kasir) {
        this.kode_kasir = kode_kasir;
    }

    public String getNama_kasir() {
        return nama_kasir;
    }

    public String getKode_kasir() {
        return kode_kasir;
    }
    
    public void process_payment(float a){
        
    }
}
