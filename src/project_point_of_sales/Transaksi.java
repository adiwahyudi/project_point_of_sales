
package project_point_of_sales;


public class Transaksi {
    private int id,id_cashier,id_customer,total;
    private String waktu,pembayaran;

    public Transaksi(int id, int id_cashier, int id_customer, int total, String waktu, String pembayaran) {
        this.id = id;
        this.id_cashier = id_cashier;
        this.id_customer = id_customer;
        this.total = total;
        this.waktu = waktu;
        this.pembayaran = pembayaran;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_cashier(int id_cashier) {
        this.id_cashier = id_cashier;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public int getId() {
        return id;
    }

    public int getId_cashier() {
        return id_cashier;
    }

    public int getId_customer() {
        return id_customer;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public int getTotal() {
        return total;
    }

    public String getWaktu() {
        return waktu;
    }
    
    
//    private String no_faktur,tanggal_transaksi;
//    private int total_transaksi;
////    Payment pembayaran;
//    
//    public Transaksi(String nomor, String tanggal, int total){
//        this.no_faktur = nomor;
//        this.tanggal_transaksi = tanggal;
//        this.total_transaksi = total;
//    }
//
//    public String getNo_faktur() {
//        return no_faktur;
//    }
//
//    public String getTanggal_transaksi() {
//        return tanggal_transaksi;
//    }
//
//    public int getTotal_transaksi() {
//        return total_transaksi;
//    }
//
//    public void setNo_faktur(String no_faktur) {
//        this.no_faktur = no_faktur;
//    }
//
//    public void setTanggal_transaksi(String tanggal_transaksi) {
//        this.tanggal_transaksi = tanggal_transaksi;
//    }
//
//    public void setTotal_transaksi(int total_transaksi) {
//        this.total_transaksi = total_transaksi;
//    }
//    
    public void getInvoice(){
    
    }
    
    public void daftar_pembelian(){
    }
    
    public void addDetailTransaksi(){
    }
    
    public void getDetailTransaksi(){}
}
