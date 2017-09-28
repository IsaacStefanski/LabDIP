package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 * @author Isaac Stefanski
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private double min = 0.00;
    private double tipPercentage;
    private double baseTipPerBag;
    private int bagCount;

    public BaggageServiceTipCalculator(double tipPercentage, int bags) {
        this.setTipPercentage(tipPercentage);
        this.setBagCount(bags);
        baseTipPerBag = 1.00;
    }

    @Override
    public final double getTip() {
        return baseTipPerBag * bagCount * (1 + tipPercentage);
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

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException("Bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException("error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
}