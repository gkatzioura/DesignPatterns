package com.gkatzioura.design.behavioural.visitor;

public class VisitorMain {

    public static void main(String[] args) {
        final LocationRequestExecutor locationRequestExecutor = new LocationRequestExecutor();
        final RouteRequestExecutor routeRequestExecutor = new RouteRequestExecutor();
        final RequestVisitor requestVisitor = new RequestVisitor();

        locationRequestExecutor.accept(requestVisitor);
        routeRequestExecutor.accept(requestVisitor);
    }
}
