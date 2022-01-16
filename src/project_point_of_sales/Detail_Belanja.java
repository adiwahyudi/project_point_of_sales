
package project_point_of_sales;


public class Detail_Belanja {
    private int id_barang,jumlah_Barang,harga_barang,total_hargaBarang;
    private String nama_barang;
    private int sizeBarang = 0;
    private int sizeKeranjang = 0;
    private Data_Barang barang[];
    private Data_Barang keranjang[];

    public Detail_Belanja(int id_barang,String nama_barang, int harga_barang, int jumlah_Barang, int total_hargaBarang) {
        this.id_barang = id_barang;
        this.jumlah_Barang = jumlah_Barang;
        this.harga_barang = harga_barang;
        this.total_hargaBarang = total_hargaBarang;
        this.nama_barang = nama_barang;
    }

    public void setBarang(Data_Barang[] barang) {
        this.barang = barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public void setJumlah_Barang(int jumlah_Barang) {
        this.jumlah_Barang = jumlah_Barang;
    }

    public void setKeranjang(Data_Barang[] keranjang) {
        this.keranjang = keranjang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setSizeBarang(int sizeBarang) {
        this.sizeBarang = sizeBarang;
    }

    public void setSizeKeranjang(int sizeKeranjang) {
        this.sizeKeranjang = sizeKeranjang;
    }

    public void setTotal_hargaBarang(int total_hargaBarang) {
        this.total_hargaBarang = total_hargaBarang;
    }

    public Data_Barang[] getBarang() {
        return barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public int getId_barang() {
        return id_barang;
    }

    public int getJumlah_Barang() {
        return jumlah_Barang;
    }

    public Data_Barang[] getKeranjang() {
        return keranjang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getSizeBarang() {
        return sizeBarang;
    }

    public int getSizeKeranjang() {
        return sizeKeranjang;
    }

    public int getTotal_hargaBarang() {
        return total_hargaBarang;
    }


    public void show_all(){
        
//        System.out.println("ID Barang           :" + this.id_Barang);
//        System.out.println("Nama Barang         :" + this.nama_Barang);
//        System.out.println("Kategori            :" + this.kategori);
//        System.out.println("Harga Jual          :" + this.harga_jual);
//        System.out.println("Harga Beli          :" + this.harga_beli);
    };
    public void add_item(int id){
//        id = id - 1;
//        for(int i =0 ; i < sizeBarang ; i++ ){
//            if( i == id){
//                this.keranjang[sizeKeranjang] = barang[i];
//                sizeKeranjang++;
//            }
//        }
    };
    public void remove_item(int id){
//        id = id -1;
//        
    };
    public void update_item(){};
    
    public void allData_Barang(Data_Barang data){
        this.barang[sizeBarang] = data;
        sizeBarang++;
    };
    
    @Override
    public String toString() {
        return nama_barang;
    }
}
