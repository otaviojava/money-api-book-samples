package org.javamoney.moneybook.chapter.four;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.MonetaryAmountFormatSymbols;
import org.javamoney.moneta.format.MonetaryAmountNumericInformation;
import org.javamoney.moneta.format.MonetaryAmountSymbols;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import java.util.Locale;

/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryAmountFormatSymbolsExample2 {

    public static void main(String[] args) {
        MonetaryAmountFormatSymbols defafult = MonetaryAmountFormatSymbols.getDefafult();
        MonetaryAmountSymbols amountSymbols = defafult.getAmountSymbols();
        MonetaryAmountNumericInformation numericInformation = defafult.getNumericInformation();

    }
}
