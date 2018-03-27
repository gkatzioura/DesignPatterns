package com.gkatzioura.design.creational.factory;

import java.util.UUID;

public class FoodVoucher implements Voucher {

    private UUID code;
    private static final String htmlMessage= "<html><body><h1>Food Voucher</h1></body></html>";

    public FoodVoucher() {
        code = UUID.randomUUID();
    }

    public String code() {
        return code.toString();
    }

    public String htmlMessage() {
        return htmlMessage;
    }
}
