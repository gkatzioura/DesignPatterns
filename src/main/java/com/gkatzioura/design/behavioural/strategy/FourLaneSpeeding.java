package com.gkatzioura.design.behavioural.strategy;

public class FourLaneSpeeding implements Speeding {

    private static final Double upperLimit = 50d;

    @Override
    public Double adjustSpeed(Double currentSpeed) {
        if(currentSpeed>upperLimit) {
            currentSpeed = upperLimit;
        }

        System.out.println("Speed adjusted at "+currentSpeed);

        return currentSpeed;
    }

}
