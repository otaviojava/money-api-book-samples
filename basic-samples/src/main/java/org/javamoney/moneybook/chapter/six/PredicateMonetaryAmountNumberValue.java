package org.javamoney.moneybook.chapter.six;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryFunctions;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by otaviojava on 31/05/15.
 */
public class PredicateMonetaryAmountNumberValue {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");



        MonetaryAmount money = Money.of(10, dollar);
        MonetaryAmount money2 = Money.of(10, dollar);
        MonetaryAmount money3 = Money.of(10, dollar);
        MonetaryAmount money4 = Money.of(9, dollar);
        MonetaryAmount money5 = Money.of(8, dollar);

        List<MonetaryAmount> greaterThanZero = Stream.of(money, money2, money3, money4, money5)
                .filter(MonetaryFunctions.isGreaterThan(Money.zero(dollar)))
                .collect(Collectors.toList());//[USD 10, USD 10, USD 10, USD 9, USD 8]

        boolean hasAnyGreaterThanZero = Stream.of(money, money2, money3, money4, money5)
                .anyMatch(MonetaryFunctions.isGreaterThan(Money.zero(dollar)));//true

        boolean allBetweenZeroAndTen = Stream.of(money, money2, money3, money4, money5)
                .allMatch(MonetaryFunctions.isBetween(Money.zero(dollar),
                        Money.of(BigDecimal.TEN, dollar)));//true

    }
}
