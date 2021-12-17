
package project_point_of_sales;


public class Transaksi {
    private String no_faktur,tanggal_transaksi;
    private int total_transaksi;
//    Payment pembayaran;
    
    public Transaksi(String nomor, String tanggal, int total){
        this.no_faktur = nomor;
        this.tanggal_transaksi = tanggal;
        this.total_transaksi = total;
    }

    public String getNo_faktur() {
        return no_faktur;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public int getTotal_transaksi() {
        return total_transaksi;
    }

    public void setNo_faktur(String no_faktur) {
        this.no_faktur = no_faktur;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public void setTotal_transaksi(int total_transaksi) {
        this.total_transaksi = total_transaksi;
    }
    
    public void getInvoice(){
    
    }
    
    public void daftar_pembelian(){
    }
    
    public void addDetailTransaksi(){
    }
    
    public void getDetailTransaksi(){}
}
