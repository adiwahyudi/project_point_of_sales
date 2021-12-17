
package project_point_of_sales;

import java.util.Date;

public class Credit extends Payment implements Payable{
    private String noKartuKredit,jenisBank;
    private Date expiredKartuKredit;

    public String getNoKartuKredit() {
        return noKartuKredit;
    }

    public String getJenisBank() {
        return jenisBank;
    }

    public Date getExpiredKartuKredit() {
        return expiredKartuKredit;
    }

    public void setNoKartuKredit(String noKartuKredit) {
        this.noKartuKredit = noKartuKredit;
    }

    public void setJenisBank(String jenisBank) {
        this.jenisBank = jenisBank;
    }

    public void setExpiredKartuKredit(Date expiredKartuKredit) {
        this.expiredKartuKredit = expiredKartuKredit;
    }
    
    @Override
    public double getAmount(){
        return 0;
    };
}
