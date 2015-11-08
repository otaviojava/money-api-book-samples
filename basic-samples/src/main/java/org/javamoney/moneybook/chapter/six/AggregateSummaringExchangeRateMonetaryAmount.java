package org.javamoney.moneybook.chapter.six;

import java.util.stream.Stream;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.convert.ConversionOperators;
import org.javamoney.moneta.convert.ExchangeRateType;
import org.javamoney.moneta.function.MonetarySummaryStatistics;

/**
 * Created by otaviojava on 31/05/15.
 */
public class AggregateSummaringExchangeRateMonetaryAmount {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");

        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.IMF);


        MonetaryAmount money = Money.of(10, dollar);
        MonetaryAmount money2 = Money.of(10, real);
        MonetaryAmount money3 = Money.of(10, dollar);
        MonetaryAmount money4 = Money.of(9, real);
        MonetaryAmount money5 = Money.of(25, dollar);

        MonetarySummaryStatistics summary = Stream.of(money, money2, money3, money4, money5)
                .collect(ConversionOperators.summarizingMonetary(dollar, provider));

        MonetaryAmount min = summary.getMin();//USD 2.831248
        MonetaryAmount max = summary.getMax();//USD 25
        MonetaryAmount average = summary.getAverage();//USD 10.195416
        long count = summary.getCount();//5
        MonetaryAmount sum = summary.getSum();//50.97708

    }
}

