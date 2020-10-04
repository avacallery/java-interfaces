package com.avacallery;

// we implement interface here
public class TaxCalculator2020
        extends AbstractClassCalculator {
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // here we are telling the interface this is the implementation of the calculateTax() method
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
