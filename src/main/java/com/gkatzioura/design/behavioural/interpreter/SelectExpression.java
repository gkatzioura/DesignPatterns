package com.gkatzioura.design.behavioural.interpreter;

public class SelectExpression implements Expression {

    @Override
    public SelectClause interpret(String context) {
        SelectClause selectClause = new SelectClause();

        /**
         * Parse text and check for expressions like `SELECT * FROM ` or `SELECT A,B,C FROM` .
         */

        return selectClause;
    }

}
