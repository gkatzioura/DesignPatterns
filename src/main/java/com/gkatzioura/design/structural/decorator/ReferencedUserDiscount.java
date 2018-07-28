package com.gkatzioura.design.structural.decorator;

import java.math.BigDecimal;

public class ReferencedUserDiscount extends DiscountDecorator {

    public static final BigDecimal FIVE = new BigDecimal(5);

    public ReferencedUserDiscount(Discount discount) {
        super(discount);
    }

    @Override
    public BigDecimal apply(BigDecimal originalPrice) {

        BigDecimal discountedPrice = super.apply(originalPrice);

        if(discountedPrice.compareTo(FIVE)<=0) {
            return discountedPrice;
        }

        return discountedPrice.subtract(FIVE);
    }
}
