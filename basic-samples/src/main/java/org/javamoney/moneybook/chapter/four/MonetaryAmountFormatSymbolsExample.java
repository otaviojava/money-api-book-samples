package org.javamoney.moneybook.chapter.four;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.MonetaryAmountFormatSymbols;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;

/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryAmountFormatSymbolsExample {

    public static void main(String[] args) {
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = Money.of(12, currency);
        MonetaryAmountFormat defaultFormat = MonetaryAmountFormatSymbols.getDefault();
        String format = defaultFormat.format(money);//R$ 12,00
        MonetaryAmount moneyParsed = Money.parse(format, defaultFormat);//or using defafult.parse(format);

    }
}
