package com.gkatzioura.design.behavioural.state;

import java.util.Date;

public class AdminGreetingState implements GreetingState {

    private static final String FOOTER_MESSAGE = "<p><Hello %s, last login was at %s</p>";

    private final String username;
    private final Date lastLogin;

    public AdminGreetingState(final String username, Date lastLogin) {
        this.username = username;
        this.lastLogin = lastLogin;
    }


    @Override
    public String create() {
        return String.format(FOOTER_MESSAGE,username,lastLogin);
    }

}
