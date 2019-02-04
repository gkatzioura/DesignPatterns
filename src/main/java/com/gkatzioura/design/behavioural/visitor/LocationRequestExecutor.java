package com.gkatzioura.design.behavioural.visitor;

public class LocationRequestExecutor implements Visitable<LocationVisitor> {

    private int successfulRequests = 0;
    private double requestsPerMinute = 0.0;

    public void executeRequest() {
        /**
         * Execute the request and change the successfulRequests and requestsPerMinute value
         */
    }

    @Override
    public void accept(LocationVisitor visitor) {
        visitor.visit(this);
    }

    public int getSuccessfulRequests() {
        return successfulRequests;
    }

    public double getRequestsPerMinute() {
        return requestsPerMinute;
    }

}
