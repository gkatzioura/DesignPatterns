package com.gkatzioura.design.behavioural.interpreter;

public interface Expression {

    Clause interpret(String context);

}
