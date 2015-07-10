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
public class PredicateMonetaryAmountMix {

    public static void main(String[] args) {
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");


        MonetaryAmount money = Money.of(10, dollar);
        MonetaryAmount money2 = Money.of(10, dollar);
        MonetaryAmount money3 = Money.of(10, dollar);
        MonetaryAmount money4 = Money.of(9, dollar);
        MonetaryAmount money5 = Money.of(8, dollar);
        MonetaryAmount money6 = Money.of(8, dollar);

		List<MonetaryAmount> greaterThanZeroAndIsReal = Stream
				.of(money, money2, money3, money4, money5, money6)
				.filter(MonetaryFunctions.isGreaterThan(Money.zero(dollar))
						.and(MonetaryFunctions.isCurrency(real)))
				.collect(Collectors.toList());//[]
		List<MonetaryAmount> greaterThanZeroOrIsReal = Stream
				.of(money, money2, money3, money4, money5, money6)
				.filter(MonetaryFunctions.isGreaterThan(Money.zero(dollar))
						.or(MonetaryFunctions.isCurrency(real)))
				.collect(Collectors.toList());//[USD 10, USD 10, USD 10, USD 9, USD 8, USD 8]

		
		List<MonetaryAmount> notGreaterThan = Stream
				.of(money, money2, money3, money4, money5, money6)
				.distinct()
				.filter(MonetaryFunctions.isGreaterThan(Money.of(9, dollar))
						.negate())
				.collect(Collectors.toList());//[USD 9, USD 8]
    }
}
