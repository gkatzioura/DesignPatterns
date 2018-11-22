package com.gkatzioura.design.behavioural.mediator;

public class Exchange {

    private FinancialEntity financialEntity;

    public Exchange(FinancialEntity financialEntity) {
        this.financialEntity = financialEntity;
    }

    public void serve(Order order) {

        /**
         * Choose the financial entity suitable for the order
         */
        financialEntity.sell(order);
    }

}
