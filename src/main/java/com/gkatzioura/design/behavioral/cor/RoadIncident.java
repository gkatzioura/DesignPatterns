package com.gkatzioura.design.behavioral.cor;

public class RoadIncident {

    private final double latitude;
    private final double longtitude;
    private final String report;

    public RoadIncident(double latitude, double longtitude, String report) {
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.report = report;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public String getReport() {
        return report;
    }
}
