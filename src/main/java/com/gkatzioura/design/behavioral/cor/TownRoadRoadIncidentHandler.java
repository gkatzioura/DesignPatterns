package com.gkatzioura.design.behavioral.cor;

public class TownRoadRoadIncidentHandler implements RoadIncidentHandler {

    private final RoadIncidentHandler successor;

    public TownRoadRoadIncidentHandler(final RoadIncidentHandler successor) {
        this.successor = successor;
    }

    @Override
    public void handle(RoadIncident roadIncident) {
        if(!withinBounds(roadIncident.getLatitude(),roadIncident.getLongtitude())) {
            successor.handle(roadIncident);
        } else {
            /**
             * Handle the incident
             */
        }
    }

    @Override
    public boolean withinBounds(double lat, double lng) {
        /**
         * Reverse geolocation, look up by name, radius based distance etc.
         */
        return false;
    }
}
