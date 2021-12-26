
package project_point_of_sales;


public class Detail_Belanja {
    private int jumlah_Barang,total_hargaBarang;
    private String deskripsi_Barang;
    private int sizeBarang = 0;
    private int sizeKeranjang = 0;
    private Data_Barang barang[];
    private Data_Barang keranjang[];
     
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
}
