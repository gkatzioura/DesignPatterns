package com.gkatzioura.design.behavioural.state;

public class AnonymousGreetingState implements GreetingState {

    private static final String FOOTER_MESSAGE = "<p><Hello anonymous user!</p>";

    @Override
    public String create() {
        return FOOTER_MESSAGE;
    }

}
