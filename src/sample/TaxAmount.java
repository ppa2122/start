package sample;

/**
 * Created by pwilkin on 21.10.2021.
 */
public class TaxAmount {

    protected double netAmount;
    protected double grossAmount;
    protected double vatAmount;

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
        this.vatAmount = netAmount * 0.23;
        this.grossAmount = netAmount + this.vatAmount;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
        this.netAmount = grossAmount / 1.23;
        this.vatAmount = grossAmount - this.netAmount;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
        this.netAmount = vatAmount / 0.23;
        this.grossAmount = this.netAmount + vatAmount;
    }
}
