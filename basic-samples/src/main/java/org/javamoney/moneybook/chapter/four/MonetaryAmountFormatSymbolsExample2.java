package org.javamoney.moneybook.chapter.four;

import org.javamoney.moneta.format.MonetaryAmountFormatSymbols;
import org.javamoney.moneta.format.MonetaryAmountNumericInformation;
import org.javamoney.moneta.format.MonetaryAmountSymbols;

/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryAmountFormatSymbolsExample2 {

    public static void main(String[] args) {
        MonetaryAmountFormatSymbols defaultFormat = MonetaryAmountFormatSymbols.getDefault();
        MonetaryAmountSymbols amountSymbols = defaultFormat.getAmountSymbols();
        MonetaryAmountNumericInformation numericInformation = defaultFormat.getNumericInformation();

    }
}
