package org.javamoney.moneybook.chapter.four;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.MonetaryAmountDecimalFormatBuilder;

/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryAmountDecimalFormatBuilderExample3 {

    public static void main(String[] args) {
    	MonetaryAmountFormat patternFormat = MonetaryAmountDecimalFormatBuilder.of("¤ ###,###.00").build();
    	
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = Money.of(12, currency);
        String format = patternFormat.format(money);//$ 12.00
        MonetaryAmount moneyParsed = Money.parse(format, patternFormat);//or using defafult.parse(format);

    }
}
