package ru.netology.taxesbigdecimal;

import java.math.BigDecimal;

//НДС = 18%
public class VaTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal calcTax = new BigDecimal("0.18");
        return(amount.multiply(calcTax));
    }

}
