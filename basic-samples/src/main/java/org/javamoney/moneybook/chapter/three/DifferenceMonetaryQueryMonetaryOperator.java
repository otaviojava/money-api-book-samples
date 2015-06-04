package org.javamoney.moneybook.chapter.three;

import org.javamoney.moneta.FastMoney;

import javax.money.*;

/**
 * Created by otaviojava on 27/05/15.
 */
public class DifferenceMonetaryQueryMonetaryOperator {

    public  static void main(String[] args) {

        MonetaryQuery<MonetaryAmount> doubleQuery = m -> m.multiply(2);
        MonetaryOperator doubleOperator = m -> m.multiply(2);

    }
}
