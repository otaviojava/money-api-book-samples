package org.javamoney.moneybook.chapter.three;

import org.javamoney.moneta.FastMoney;

import javax.money.*;

/**
 * Created by otaviojava on 27/05/15.
 */
public class HelloMonetaryQuery {

    public  static void main(String[] args) {
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = FastMoney.of(10, currency);
        MonetaryQuery<String> currencyCodeQuery = m -> m.getCurrency().getCurrencyCode();
        String result = currencyCodeQuery.queryFrom(money);//BRL
        String result2 = money.query(currencyCodeQuery);//BRL
    }
}
