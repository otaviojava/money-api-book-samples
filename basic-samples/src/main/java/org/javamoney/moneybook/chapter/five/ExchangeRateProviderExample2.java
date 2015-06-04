package org.javamoney.moneybook.chapter.five;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.convert.ExchangeRateType;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 * Created by otaviojava on 30/05/15.
 */
public class ExchangeRateProviderExample2 {

    public static void main(String[] args) {

        CurrencyUnit dollar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");

        MonetaryAmount money = FastMoney.of(10, dollar);
        MonetaryAmount money2 = FastMoney.of(10, real);


        LocalDate localDate = Year.of(2009).atMonth(Month.JANUARY).atDay(9);

        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.IMF_HIST);
        ConversionQuery query = ConversionQueryBuilder.of().setTermCurrency(dollar).set(localDate).build();

        CurrencyConversion currencyConversion = provider.getCurrencyConversion(query);

        MonetaryAmount result = currencyConversion.apply(money2);
        MonetaryAmount monetaryAmount = money.add(result);
        System.out.println(monetaryAmount);
    }
}
