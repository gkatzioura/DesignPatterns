package com.gkatzioura.design.creational.factory;

import java.util.UUID;

public class ClothesVoucher implements Voucher {

    private UUID code;
    private static final String htmlMessage = "<html><body><h1>Clothes Voucher</h1></body></html>";

    public ClothesVoucher() {
        code = UUID.randomUUID();
    }

    public String code() {
        return code.toString();
    }

    public String htmlMessage() {
        return htmlMessage;
    }
}
