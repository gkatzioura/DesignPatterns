package com.gkatzioura.design.behavioral.interpreter;

public class WhereExpression implements Expression {

    @Override
    public WhereClause interpret(String context) {
        WhereClause whereClause = new WhereClause();
        /**
         * Parse the string and find any where statements ie. A=1 AND B!=2 and apply them.
         */

        return whereClause;
    }

}
