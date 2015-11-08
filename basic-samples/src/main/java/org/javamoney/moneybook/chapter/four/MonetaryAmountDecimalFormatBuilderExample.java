package org.javamoney.moneybook.chapter.four;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.MonetaryAmountDecimalFormatBuilder;

/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryAmountDecimalFormatBuilderExample {

    public static void main(String[] args) {
    	MonetaryAmountFormat defaultFormat = MonetaryAmountDecimalFormatBuilder.newInstance().build();
    	MonetaryAmountFormat patternFormat = MonetaryAmountDecimalFormatBuilder.of("¤ ###,###.00").build();
    	MonetaryAmountFormat localeFormat = MonetaryAmountDecimalFormatBuilder.of(Locale.US).build();
    	
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = Money.of(12, currency);
        String format = defaultFormat.format(money);//$12.00
        MonetaryAmount moneyParsed = Money.parse(format, defaultFormat);//or using defafult.parse(format);

    }
}
