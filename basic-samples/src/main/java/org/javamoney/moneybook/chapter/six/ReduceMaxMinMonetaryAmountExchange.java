package org.javamoney.moneybook.chapter.six;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.convert.ExchangeRateType;
import org.javamoney.moneta.function.MonetaryFunctions;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by otaviojava on 31/05/15.
 */
public class ReduceMaxMinMonetaryAmountExchange {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit euro = Monetary.getCurrency("EUR");
        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.IMF);

        MonetaryAmount money = Money.of(10, dollar);
        MonetaryAmount money2 = Money.of(10, euro);
        MonetaryAmount money3 = Money.of(10, dollar);
        MonetaryAmount money4 = Money.of(9, euro);
        MonetaryAmount money5 = Money.of(8, dollar);

        Optional<MonetaryAmount> max = Stream.of(money, money2, money3, money4, money5).reduce(
                MonetaryFunctions.max(provider));//javax.money.MonetaryException: Currency mismatch: BRL/USD
        max.ifPresent(System.out::println);//EUR 10

        Optional<MonetaryAmount> min = Stream.of(money, money2, money3, money4, money5).reduce(
                MonetaryFunctions.min(provider));
        min.ifPresent(System.out::println);//USD 8
        
    }
}
