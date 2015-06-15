package org.javamoney.moneybook.chapter.six;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.GroupMonetarySummaryStatistics;
import org.javamoney.moneta.function.MonetaryFunctions;
import org.javamoney.moneta.function.MonetarySummaryStatistics;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by otaviojava on 31/05/15.
 */
public class AggregateGroupSummaringMonetaryAmount {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");



        MonetaryAmount money = Money.of(10, dollar);
        MonetaryAmount money2 = Money.of(10, real);
        MonetaryAmount money3 = Money.of(10, dollar);
        MonetaryAmount money4 = Money.of(9, real);
        MonetaryAmount money5 = Money.of(25, dollar);

        GroupMonetarySummaryStatistics grouped = Stream.of(money, money2, money3, money4, money5)
        .collect(MonetaryFunctions.groupBySummarizingMonetary());
        Map<CurrencyUnit, MonetarySummaryStatistics> mapSummary = grouped.get();
        MonetarySummaryStatistics summary = mapSummary.get(dollar);

        MonetaryAmount min = summary.getMin();//USD 10
        MonetaryAmount max = summary.getMax();//USD 25
        MonetaryAmount average = summary.getAverage();//USD 15
        long count = summary.getCount();//3
        MonetaryAmount sum = summary.getSum();//USD 45

    }
}
