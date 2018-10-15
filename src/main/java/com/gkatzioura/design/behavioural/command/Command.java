package com.gkatzioura.design.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Command {

    public static void main(String[] args) {
        List<BetCommand> betCommands = new ArrayList<>();
        betCommands.add(new BackingCommand(new Bet("match1",10)));
        betCommands.add(new BackingCommand(new Bet("match2",11)));

        BetBook betBook = new BetBook();
        betCommands.forEach(bc->bc.applyTo(betBook));
    }

}
