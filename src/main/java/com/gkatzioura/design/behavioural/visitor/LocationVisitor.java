package com.gkatzioura.design.behavioural.visitor;

public interface LocationVisitor extends Visitor {

    void visit(LocationRequestExecutor locationRequestExecutor);
}
