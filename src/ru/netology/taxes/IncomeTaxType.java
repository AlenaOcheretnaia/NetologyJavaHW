package ru.netology.taxes;

//Подоходный налог, = 13%
public class IncomeTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        double calcTax = 0.13;
        return(calcTax*amount);
    }
}
