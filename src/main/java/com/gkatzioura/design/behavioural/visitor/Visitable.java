package com.gkatzioura.design.behavioural.visitor;

public interface Visitable<T extends Visitor> {

     void accept(T visitor);

}
