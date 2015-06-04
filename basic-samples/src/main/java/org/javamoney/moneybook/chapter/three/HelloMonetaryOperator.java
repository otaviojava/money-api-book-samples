package org.javamoney.moneybook.chapter.three;

import org.javamoney.moneta.FastMoney;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;

/**
 * Created by otaviojava on 27/05/15.
 */
public class HelloMonetaryOperator {

    public  static void main(String[] args) {
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = FastMoney.of(10, currency);
        MonetaryOperator doubleOperator = m -> m.multiply(2);
        MonetaryAmount result = doubleOperator.apply(money);//BRL 20.00000
        MonetaryAmount result2 = result.with(doubleOperator);//BRL 40.00000
    }
}
