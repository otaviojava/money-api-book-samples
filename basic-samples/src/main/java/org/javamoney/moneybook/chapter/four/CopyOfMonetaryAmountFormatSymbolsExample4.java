package org.javamoney.moneybook.chapter.four;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.MonetaryAmountFormatSymbols;
import org.javamoney.moneta.format.MonetaryAmountNumericInformation;
import org.javamoney.moneta.format.MonetaryAmountSymbols;
import org.javamoney.moneta.spi.MoneyProducer;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.format.MonetaryAmountFormat;
import java.util.Locale;

/**
 * Created by otaviojava on 29/05/15.
 */
public class CopyOfMonetaryAmountFormatSymbolsExample4 {

    public static void main(String[] args) {
        MonetaryAmountSymbols symbols = new MonetaryAmountSymbols(Locale.US);// new MonetaryAmountSymbols();
        symbols.setCurrencySymbol("Mon");
        MonetaryAmountFormat formater = MonetaryAmountFormatSymbols.of(symbols, new MoneyProducer());
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        String text = formater.format(Money.of(10, currency));//Mon 10.00

    }
}
