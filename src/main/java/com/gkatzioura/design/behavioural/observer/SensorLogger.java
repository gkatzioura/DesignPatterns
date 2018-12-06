package com.gkatzioura.design.behavioural.observer;

public class SensorLogger implements Observer {

    @Override
    public void update(SensorData sensorData) {

        /**
         * Persist data to the database
         */

        System.out.println(String.format("Received sensor data %s: %f",sensorData.getSensor(),sensorData.getMeasure()));
    }

}
