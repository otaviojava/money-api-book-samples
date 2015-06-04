package org.javamoney.moneybook.chapter.five;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.convert.ExchangeRateType;
import org.javamoney.moneta.function.MonetaryOperators;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;
import javax.money.convert.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by otaviojava on 30/05/15.
 */
public class ExchangeRateProviderExample5 {

    public static void main(String[] args) {

        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");

        MonetaryAmount money = FastMoney.of(10, dollar);
        MonetaryAmount money2 = FastMoney.of(10, real);


        MonetaryOperator operator = MonetaryOperators.exchange(dollar);
        MonetaryAmount result = money2.with(operator).add(money);//USD 20.00000 ignoring currency
    }
}
