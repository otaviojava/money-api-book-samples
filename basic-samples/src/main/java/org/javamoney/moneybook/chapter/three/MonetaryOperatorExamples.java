package org.javamoney.moneybook.chapter.three;

import org.javamoney.moneta.FastMoney;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;

/**
 * Created by otaviojava on 27/05/15.
 */
public class MonetaryOperatorExamples {

    public  static void main(String[] args) {
        MonetaryOperator doubleOperator = m -> m.multiply(2);
        MonetaryOperator halfOperator = m -> m.divide(2);
        MonetaryOperator operator = m -> {
            if(m.isPositive()){
                return m.multiply(2);
            }
            return m.divide(2);
        };
    }
}
