package org.javamoney.moneybook.chapter.two;

import org.javamoney.moneta.FastMoney;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.Locale;

/**
 * Created by otaviojava on 25/05/15.
 */
public class CurrencyExample2 {

    public static void main(String[] args) {
        CurrencyUnit currencyUnit = Monetary.getCurrency(Locale.US);
        String currencyCode = currencyUnit.getCurrencyCode();//USD
        int numericCurrencyCode = currencyUnit.getNumericCode();//840
        int fractionDigits = currencyUnit.getDefaultFractionDigits();//2

    }
}
