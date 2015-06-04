package org.javamoney.moneybook.chapter.two;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;

public class MethodsCreationMoney {

    public static void main(String[] args) {
        CurrencyUnit currency = Monetary.getCurrency("BRL");
        MonetaryAmount money = Money.of(BigDecimal.TEN, currency); //BRL 10
        MonetaryAmount zero = Money.zero(currency);//BRL 0
        MonetaryAmount moneyFromCurrencyCode = Money.of(10, "USD");//USD 10
        MonetaryAmount moneyFromCents = Money.ofMinor(currency, 100_00);//BRL 10
    }
}
