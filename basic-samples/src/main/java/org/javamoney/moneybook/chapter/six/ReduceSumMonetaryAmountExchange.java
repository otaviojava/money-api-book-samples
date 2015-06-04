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
public class ReduceSumMonetaryAmountExchange {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");
        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.IMF);

        MonetaryAmount money = Money.of(10, dollar);
        MonetaryAmount money2 = Money.of(10, dollar);
        MonetaryAmount money3 = Money.of(10, real);
        MonetaryAmount money4 = Money.of(9, dollar);
        MonetaryAmount money5 = Money.of(8, dollar);

        Optional<MonetaryAmount> result = Stream.of(money, money2, money3, money4, money5).reduce(
                MonetaryFunctions.sum(provider, dollar));//javax.money.MonetaryException: Currency mismatch: BRL/USD
        result.ifPresent(System.out::println);//money converted in dollar
        
    }
}
