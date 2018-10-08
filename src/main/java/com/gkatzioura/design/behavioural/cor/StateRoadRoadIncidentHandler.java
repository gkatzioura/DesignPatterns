package com.gkatzioura.design.behavioural.cor;

public class StateRoadRoadIncidentHandler implements RoadIncidentHandler {

    @Override
    public void handle(RoadIncident roadIncident) {
        if(!withinBounds(roadIncident.getLatitude(),roadIncident.getLatitude())) {
            throw new IllegalArgumentException("Incident cannot be handled by state. No successor available");
        }

        /**
         * Handle the incident
         */
    }

    @Override
    public boolean withinBounds(double lat, double lng) {

        /**
         * Reverse geolocation, look up by name, radius based distance etc.
         */

        return true;
    }
}
