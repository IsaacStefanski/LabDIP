package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 * @author Isaac Stefanski
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private double min = 0.00;
    private String BILL_ENTRY_ERR = "Error: bill must be above $" + min;
    private double tipPercentage;
    private double bill;

    public FoodServiceTipCalculator(double tipPercentage, double billAmt) {
        this.setTipPercentage(tipPercentage);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        return bill * tipPercentage;
    }
    
    @Override
    public final void setTipPercentage(double tipPercentage) {
        if (tipPercentage > min){
            this.tipPercentage = tipPercentage;
        } else {
            throw new IllegalArgumentException("Enter a tip above" + min + "%");
        }
    }

    @Override
    public final double getTipPercentage() {
        return tipPercentage;
    }

    public final void setBill(double billAmt) {
        if(billAmt < min) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }
}