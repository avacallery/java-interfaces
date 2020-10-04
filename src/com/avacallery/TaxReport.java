package com.avacallery;

public class TaxReport {

    // what state and behavior? We need to work with TaxCalculator
    private TaxCalculator calculator;

    // we are injecting a dependency using the constructor
    // who is going to inject this?
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    // method injection
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    // we can use this setter to inject dependencies
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
    }

