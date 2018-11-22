package com.gkatzioura.design.behavioural.mediator;

public class Trader {

    private Exchange exchange;

    public Trader(Exchange exchange) {
        this.exchange = exchange;
    }

    public void buy(String stock,Integer quantity,Double price) {
        Order order = new Order();
        order.setStock(stock);
        order.setQuantity(quantity);
        order.setPrice(price);
        exchange.serve(order);
    }

}
