package ru.netology.taxes;

//Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15%
public class ProgressiveTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        double calcTax;
        if (amount > 100_000) {
            calcTax = 0.15;
        } else {
            calcTax = 0.1;

        }
        return(calcTax*amount);
    }

}
