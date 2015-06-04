package org.javamoney.moneybook.chapter.two;

import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

/**
 * Created by otaviojava on 27/05/15.
 */
public class RetrieveInformationMethods {

    public  static  void main(String[] args) {

        MonetaryAmount money = Money.of(10, Monetary.getCurrency("BRL"));
        CurrencyUnit currency = money.getCurrency();
        Number number = money.getNumber();

    }
}
