package com.gkatzioura.design.behavioral.command;

public class BackingCommand implements BetCommand {

    private final Bet bet;

    public BackingCommand(final Bet bet) {
        this.bet = bet;
    }

    @Override
    public void applyTo(BetBook betBook) {
        betBook.addBacking(bet.getMatch(),bet.getAmount());
    }

}
