package com.gkatzioura.design.behavioural.visitor;

public class RouteRequestExecutor implements Visitable<RouteVisitor> {

    private int successfulRequests = 0;
    private double requestsPerMinute = 0.0;

    public void executeRequest() {
        /**
         * Execute the request and change the successfulRequests and requestsPerMinute value
         */
    }

    @Override
    public void accept(RouteVisitor visitor) {
        visitor.visit(this);
    }

    public int getSuccessfulRequests() {
        return successfulRequests;
    }

    public double getRequestsPerMinute() {
        return requestsPerMinute;
    }
}
