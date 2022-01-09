
package project_point_of_sales;


public class Cashier {
    private String id,username,password,nama,kode;

    public Cashier(String id, String username, String password, String nama, String kode) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.kode = kode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    public void process_payment(float a){
        
    }
}
