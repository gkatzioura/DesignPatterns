package com.gkatzioura.design.structural.decorator;

import java.math.BigDecimal;

public class DecoratorScenario {

    public static void main(String args[]) {

        NewlyRegisteredDiscount newlyRegisteredDiscount = new NewlyRegisteredDiscount();
        ReferencedUserDiscount referencedUserDiscount = new ReferencedUserDiscount(newlyRegisteredDiscount);
        TwoYearPlanDiscount twoYearPlanDiscount = new TwoYearPlanDiscount(referencedUserDiscount);
        BigDecimal discountPrice = twoYearPlanDiscount.apply(new BigDecimal(100));
    }

}
