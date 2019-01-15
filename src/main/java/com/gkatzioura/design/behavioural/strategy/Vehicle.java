package com.gkatzioura.design.behavioural.strategy;

public class Vehicle {

    private Speeding speeding;
    private Double currentSpeed;

    public void drive() {

        speeding.adjustSpeed(currentSpeed);

        /**
         * Driving related actions.
         */
    }

    public void setSpeeding(Speeding speeding) {
        this.speeding = speeding;
    }

    public void setCurrentSpeed(Double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
