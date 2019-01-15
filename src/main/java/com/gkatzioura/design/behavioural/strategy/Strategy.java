package com.gkatzioura.design.behavioural.strategy;

public class Strategy {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setCurrentSpeed(70d);

        vehicle.drive();

        /**
         * Changed route
         */

        vehicle.setSpeeding(new FourLaneSpeeding());

        vehicle.drive();

        /**
         * Changed route
         */

        vehicle.setSpeeding(new UrbanAreaSpeeding());

        vehicle.drive();
    }
}
