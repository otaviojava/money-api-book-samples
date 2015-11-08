package org.javamoney.moneybook.chapter.four;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.MonetaryAmountDecimalFormatBuilder;
import org.javamoney.moneta.function.MoneyProducer;

/**
 * Created by otaviojava on 29/05/15.
 */
public class MonetaryAmountDecimalFormatBuilderExample2 {

    public static void main(String[] args) {
    	CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = Money.of(12, currency);
        
    	MonetaryAmountFormat formater = MonetaryAmountDecimalFormatBuilder.of(new Locale("pt", "BR")).
    			withCurrencyUnit(currency).withProducer(new MoneyProducer()).build();
    	
        
        String format = formater.format(money);//R$ 12,00
        MonetaryAmount moneyParsed = Money.parse(format, formater);//or using defafult.parse(format);

    }
}
