package ru.netology.taxesbigdecimal;

import java.math.BigDecimal;

//-------БАЗОВЫЙ КЛАСС------
class TaxType {

    public BigDecimal calculateTaxFor(BigDecimal amount){
        return(new BigDecimal("0.0"));
    };
}
