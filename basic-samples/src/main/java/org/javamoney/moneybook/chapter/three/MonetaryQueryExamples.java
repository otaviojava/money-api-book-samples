package org.javamoney.moneybook.chapter.three;

import javax.money.MonetaryQuery;
import java.math.BigDecimal;

/**
 * Created by otaviojava on 27/05/15.
 */
public class MonetaryQueryExamples {

    public static void main(String[] args) {
        MonetaryQuery<Long> longQuery = m -> m.getNumber().longValue();
        MonetaryQuery<String> currencyCodeQuery = m -> m.getCurrency().getCurrencyCode();
        MonetaryQuery<Integer> fractionDigits = m -> m.getCurrency().getDefaultFractionDigits();


    }
}
