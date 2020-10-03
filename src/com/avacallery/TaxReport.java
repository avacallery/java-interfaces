package com.avacallery;

public class TaxReport {
    // what state and behavior? We need to work with TaxCalculator
    private TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
