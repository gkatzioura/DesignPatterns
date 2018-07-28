package com.gkatzioura.design.structural.decorator;

import java.math.BigDecimal;

public interface Discount {

    BigDecimal apply(BigDecimal originalPrice);

}
