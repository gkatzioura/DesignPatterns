package com.gkatzioura.design.behavioural.interpreter;

import java.util.Optional;

public class SelectClause implements Clause {

    private Optional<WhereClause> optWhereClause = Optional.empty();

    public <T> T load(Class<T> valueType) {

        /**
         * Apply filter according to the where clause
         */
        if(optWhereClause.isPresent()) {

        }

        /**
         * Load data
         */

        /**
         * Serialize/Deserialize data based on the type
         * For example if you use jackson it will be:  new ObjectMapper().readValue("text",valueType);
         */


        return null;
    }

    public void setWhereClause(WhereClause whereClause) {
        this.optWhereClause = Optional.of(whereClause);
    }
}
