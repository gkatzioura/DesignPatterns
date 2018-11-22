package com.gkatzioura.design.behavioural.mediator;

public class Mediator {

    public static void main(String[] args) {

        final FinancialEntity financialEntity = new FinancialEntity();
        final Exchange exchange = new Exchange(financialEntity);
        Trader trader = new Trader(exchange);
        trader.buy("stock_a",2,32.2d);
    }
}
