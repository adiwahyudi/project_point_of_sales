
package project_point_of_sales;


public class Cash extends Payment implements Payable{
    private double kembalian;

    public void setKembalian(double kembalian) {
        this.kembalian = kembalian;
    }

    public double getKembalian() {
        return kembalian;
    }
    
    @Override
    public double getAmount(){
        return 0;
    };
}

