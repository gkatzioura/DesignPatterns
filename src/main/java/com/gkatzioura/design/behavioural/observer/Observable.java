package com.gkatzioura.design.behavioural.observer;

public interface Observable {

    void register(Observer observer);

    void unregister(Observer observer);

    void updateObservers();

}
