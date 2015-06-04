package org.javamoney.moneybook.chapter.three;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryQueries;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.Locale;

/**
 * Created by otaviojava on 27/05/15.
 */
public class MonetaryQueriesExample {

    public static void main(String[] args) {
        CurrencyUnit currency = Monetary.getCurrency(Locale.US);

        MonetaryAmount money = Money.of(120.23, currency);
        Long moneyInCents = money.query(MonetaryQueries.convertMinorPart());//12023
        Long majorPart = money.query(MonetaryQueries.extractMajorPart());//120
        Long minorPart = money.query(MonetaryQueries.extractMinorPart());//23

    }
}

