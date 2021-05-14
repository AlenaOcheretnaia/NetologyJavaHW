package ru.netology.taxesbigdecimal;

import java.math.BigDecimal;

//Подоходный налог, = 13%
public class IncomeTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal calcTax = new BigDecimal("0.13");
        return(amount.multiply(calcTax));
    }
}
