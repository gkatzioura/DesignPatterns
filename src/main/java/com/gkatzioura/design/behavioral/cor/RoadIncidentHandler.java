package com.gkatzioura.design.behavioral.cor;

public interface RoadIncidentHandler {

    void handle(RoadIncident roadIncident);

    boolean withinBounds(double lat, double lng);

}
