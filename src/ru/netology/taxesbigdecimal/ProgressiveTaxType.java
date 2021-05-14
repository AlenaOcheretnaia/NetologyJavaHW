package ru.netology.taxesbigdecimal;

import java.math.BigDecimal;

//Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15%
public class ProgressiveTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal calcTax;
        if (amount.compareTo(new BigDecimal(100000)) <= 0) {
            calcTax = new BigDecimal("0.1");
        } else {
            calcTax = new BigDecimal("0.15");
        }
        BigDecimal multiply = amount.multiply(calcTax);
        return(multiply);
    }

}
