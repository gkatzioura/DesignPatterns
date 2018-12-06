package com.gkatzioura.design.behavioural.observer;

public class SensorData {

    private final String sensor;
    private final Double measure;

    public SensorData(String sensor, Double measure) {
        this.sensor = sensor;
        this.measure = measure;
    }

    public String getSensor() {
        return sensor;
    }

    public Double getMeasure() {
        return measure;
    }
}
