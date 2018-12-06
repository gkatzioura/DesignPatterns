package com.gkatzioura.design.behavioural.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SensorReceiver implements Observable {

    private List<SensorData> data = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void addData(SensorData sensorData) {
        data.add(sensorData);
    }

    @Override
    public void updateObservers() {


        /**
         * The sensor receiver has retrieved some sensor data and thus it will notify the observer
         * on the data it accumulated.
         */

        Iterator<SensorData> iterator = data.iterator();

        while (iterator.hasNext()) {

            SensorData sensorData = iterator.next();

            for(Observer observer:observers) {
                observer.update(sensorData);
            }

            iterator.remove();
        }
    }

}
