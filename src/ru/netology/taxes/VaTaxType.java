package ru.netology.taxes;

//НДС = 18%
public class VaTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        double calcTax = 0.18;
        return(calcTax*amount);
    }

}
