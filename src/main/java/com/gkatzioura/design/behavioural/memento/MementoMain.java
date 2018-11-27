package com.gkatzioura.design.behavioural.memento;

public class MementoMain {

    public static void main(String[] args) {

        Double balance = 20.1d;

        Originator originator = new Originator();
        originator.setBalance(balance);

        CareTaker careTaker = new CareTaker();

        careTaker.add(originator.saveToMemento());

        /**
         * Do a transaction
         */

        originator.setBalance(balance-2);
        careTaker.add(originator.saveToMemento());

        /**
         * Do a transaction
         */

        originator.setBalance(balance+4);
        careTaker.add(originator.saveToMemento());

        System.out.println(careTaker.get(0).getBalance());
        System.out.println(careTaker.get(1).getBalance());
        System.out.println(careTaker.get(2).getBalance());
    }
}
