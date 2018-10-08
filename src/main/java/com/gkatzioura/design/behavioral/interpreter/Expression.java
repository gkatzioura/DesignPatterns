package com.gkatzioura.design.behavioral.interpreter;

public interface Expression {

    Clause interpret(String context);

}
