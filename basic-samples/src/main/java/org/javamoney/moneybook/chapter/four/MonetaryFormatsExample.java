package org.javamoney.moneybook.chapter.four;


import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Locale;


/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryFormatsExample {


    public static void main(String[] args) {
        CurrencyUnit currency = Monetary.getCurrency("EUR");
        MonetaryAmount money = Money.of(12, currency);

        MonetaryAmountFormat format =
                MonetaryFormats.getAmountFormat(Locale.US);

        String resultText = format.format(money);//EUR 12
        MonetaryAmount monetaryAmount = format.parse(resultText);
        MonetaryAmount result2 = Money.parse(resultText, format);

    }
}
