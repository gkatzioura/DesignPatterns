package com.gkatzioura.design.behavioural.memento;

public class Originator {

    private Double balance;

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public Memento saveToMemento() {
        return new Memento(balance);
    }

    public void restoreToState(Memento memento) {
        balance =  memento.getBalance();
    }
}
