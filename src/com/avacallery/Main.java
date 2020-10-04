package com.avacallery;


public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2020(100_000);
        // it is up to Main to inject implementations (ex: TaxReport(calculator))
        var report = new TaxReport(calculator);
    }
}
