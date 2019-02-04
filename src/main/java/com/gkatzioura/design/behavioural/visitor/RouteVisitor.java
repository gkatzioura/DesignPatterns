package com.gkatzioura.design.behavioural.visitor;

public interface RouteVisitor extends Visitor {

    void visit(RouteRequestExecutor routeRequestExecutor);
}
