package com.avacallery;

public class TaxReport {
    // what state and behavior? We need to work with TaxCalculator
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
