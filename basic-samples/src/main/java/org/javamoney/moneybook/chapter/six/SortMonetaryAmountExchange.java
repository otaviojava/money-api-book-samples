package org.javamoney.moneybook.chapter.six;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.convert.ExchangeRateType;
import org.javamoney.moneta.function.MonetaryFunctions;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by otaviojava on 31/05/15.
 */
public class SortMonetaryAmountExchange {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit euro = Monetary.getCurrency("EUR");
        CurrencyUnit real = Monetary.getCurrency("BRL");

        MonetaryAmount money = Money.of(9, euro);
        MonetaryAmount money2 = Money.of(10, dollar);
        MonetaryAmount money3 = Money.of(11, real);

        ExchangeRateProvider provider =
                MonetaryConversions.getExchangeRateProvider(ExchangeRateType.IMF);

        ;
        List<MonetaryAmount> resultAsc = Stream.of(money, money2, money3)
                .sorted(MonetaryFunctions
                        .sortValuable(provider))
                .collect(Collectors.toList());//[BRL 11, EUR 9, USD 10]

        List<MonetaryAmount> resultDesc = Stream.of(money, money2, money3)
                .sorted(MonetaryFunctions
                        .sortValuableDesc(provider)).collect(Collectors.toList());//[USD 10, EUR 9, BRL 11]

    }
}
