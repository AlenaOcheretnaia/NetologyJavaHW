package ru.netology.taxes;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(23345.34, new IncomeTaxType(), taxService),
                new Bill(19345.84, new VaTaxType(), taxService),
                new Bill(72634.94, new ProgressiveTaxType(), taxService),
                new Bill(162648.25, new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
