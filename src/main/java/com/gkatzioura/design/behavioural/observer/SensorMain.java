package com.gkatzioura.design.behavioural.observer;

public class SensorMain {

    public static void main(String[] args) {

        SensorReceiver sensorReceiver = new SensorReceiver();
        SensorLogger sensorLogger = new SensorLogger();
        sensorReceiver.register(sensorLogger);
        sensorReceiver.addData(new SensorData("temperature",1.2d));
        sensorReceiver.updateObservers();
    }

}
