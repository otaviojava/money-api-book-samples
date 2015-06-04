package org.javamoney.moneybook.chapter.six;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryFunctions;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by otaviojava on 31/05/15.
 */
public class BooleanMonetaryAmount {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");


        MonetaryAmount money = Money.of(10, dollar);
        MonetaryAmount money2 = Money.of(10, real);
        MonetaryAmount money3 = Money.of(10, dollar);
        MonetaryAmount money4 = Money.of(9, real);
        MonetaryAmount money5 = Money.of(8, dollar);

        Stream<MonetaryAmount> justDollars = Stream.of(money, money2, money3, money4, money5)
                .filter(MonetaryFunctions.isCurrency(dollar));

        boolean anyMatch = Stream.of(money, money2, money3, money4, money5)
                .anyMatch(MonetaryFunctions.isCurrency(dollar));//true

        boolean allMatch = Stream.of(money, money2, money3, money4, money5)
                .allMatch(MonetaryFunctions.isCurrency(dollar));//true


    }
}
