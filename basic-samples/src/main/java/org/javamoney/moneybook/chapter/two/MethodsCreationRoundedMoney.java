package org.javamoney.moneybook.chapter.two;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.RoundedMoney;

public class MethodsCreationRoundedMoney {

	public static void main(String[] args) {
		CurrencyUnit currency = Monetary.getCurrency("BRL");
		MonetaryAmount money = RoundedMoney.of(BigDecimal.TEN, currency); // BRL
																			// 10
		MonetaryAmount zero = RoundedMoney.zero(currency);// BRL 0
		MonetaryAmount moneyFromCurrencyCode = RoundedMoney.of(10, "USD");// USD
																			// 10
		MonetaryAmount moneyFromCents = RoundedMoney.ofMinor(currency, 100_00);// BRL
																				// 10
	}
}
