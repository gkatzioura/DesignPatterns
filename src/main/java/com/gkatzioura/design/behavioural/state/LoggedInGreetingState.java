package com.gkatzioura.design.behavioural.state;

public class LoggedInGreetingState implements GreetingState {

    private static final String FOOTER_MESSAGE = "<p><Hello %s!</p>";

    private final String username;

    public LoggedInGreetingState(final String username) {
        this.username = username;
    }

    @Override
    public String create() {
        return String.format(FOOTER_MESSAGE,username);
    }

}
