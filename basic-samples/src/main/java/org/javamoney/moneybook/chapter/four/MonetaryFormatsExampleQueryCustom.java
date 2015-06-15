package org.javamoney.moneybook.chapter.four;

import java.util.Locale;

import javax.money.MonetaryAmount;
import javax.money.format.AmountFormatQueryBuilder;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.CurrencyStyle;

/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryFormatsExampleQueryCustom {

    public static void main(String[] args) {
    	MonetaryAmount amount = Money.of(12345.67, "USD");
    	MonetaryAmountFormat customFormat = MonetaryFormats.getAmountFormat(
    			AmountFormatQueryBuilder.of(Locale.US)
    			.set(CurrencyStyle.NAME)
    			.set("pattern", "00,00,00,00.00 ¤")
    			.build()); 

    			String formatted = customFormat.format(amount); //00,01,23,45.67 US Dollar
    }
}
