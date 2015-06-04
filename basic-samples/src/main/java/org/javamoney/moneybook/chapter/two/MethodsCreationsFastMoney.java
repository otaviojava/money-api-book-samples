package org.javamoney.moneybook.chapter.two;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.FastMoney;

public class MethodsCreationsFastMoney {

	public static void main(String[] args) {
		CurrencyUnit currency = Monetary.getCurrency("BRL");
		MonetaryAmount money = FastMoney.of(BigDecimal.TEN, currency); // BRL 10
		MonetaryAmount zero = FastMoney.zero(currency);// BRL 0
		MonetaryAmount moneyFromCurrencyCode = FastMoney.of(10, "USD");// USD 10
		MonetaryAmount moneyFromCents = FastMoney.ofMinor(currency, 100_00);// BRL
																			// 10
	}
}
