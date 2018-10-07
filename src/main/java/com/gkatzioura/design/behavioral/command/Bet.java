package com.gkatzioura.design.behavioral.command;

public class Bet {

    private final String match;
    private final Integer amount;

    public Bet(final String match, final Integer amount) {
        this.match = match;
        this.amount = amount;
    }

    public String getMatch() {
        return match;
    }

    public Integer getAmount() {
        return amount;
    }
}
