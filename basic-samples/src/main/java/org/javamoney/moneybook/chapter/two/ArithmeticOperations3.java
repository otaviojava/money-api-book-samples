package org.javamoney.moneybook.chapter.two;

import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

/**
 * Created by otaviojava on 27/05/15.
 */
public class ArithmeticOperations3 {

    public static void main(String[] args) {
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = Money.of(100, currency);
        MonetaryAmount negateResult = money.negate();//BRL -100
        MonetaryAmount plusResult = money.plus();//BRL 100
    }
}
