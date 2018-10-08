package com.gkatzioura.design.behavioural.command;

public class LayingCommand implements BetCommand {

    private final Bet bet;

    public LayingCommand(final Bet bet) {
        this.bet = bet;
    }

    @Override
    public void applyTo(BetBook betBook) {
        betBook.addLaying(bet.getMatch(),bet.getAmount());
    }
}
