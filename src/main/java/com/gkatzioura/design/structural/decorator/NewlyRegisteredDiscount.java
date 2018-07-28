package com.gkatzioura.design.structural.decorator;

import java.math.BigDecimal;

public class NewlyRegisteredDiscount implements Discount {

    public static final BigDecimal SEVENTY_FIVE = new BigDecimal(75);
    public static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    @Override
    public BigDecimal apply(BigDecimal originalPrice) {

        return originalPrice.multiply(SEVENTY_FIVE).divide(ONE_HUNDRED);
    }

}
