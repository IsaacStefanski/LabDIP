package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private static final double MIN = 0.00;
    private double tipPercentage;
    private double baseTipPerBag;
    private int bagCount;

    public BaggageServiceTipCalculator(double tipPercentage, int bags) {
        this.setTipPercentage(tipPercentage);
        this.setBagCount(bags);
        baseTipPerBag = 1.00;
    }

    @Override
    public double getTip() {
        return baseTipPerBag * bagCount * (1 + tipPercentage);
    }

    public final void setTipPercentage(double tipPercentage) {
        if (tipPercentage > MIN){
            this.tipPercentage = tipPercentage;
        } else {
            throw new IllegalArgumentException("Enter a tip above" + MIN + "%");
        }
    }

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