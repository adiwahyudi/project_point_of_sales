
package project_point_of_sales;

public class Customer {
    String id_customer,username,password,alamat;

    public Customer(String id,String username,String password,String alamat){
        this.id_customer = id;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
    }
    public void setId_customer(String id_customer) {
        this.id_customer = id_customer;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getId_customer() {
        return id_customer;
    }

    public String getUsername() {
        return username;
    }
 
    public String getPassword() {
        return password;
    }

    public String getAlamat() {
        return alamat;
    }
     
    public void make_invoice(){
           
    }
}
