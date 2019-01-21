package com.gkatzioura.design.behavioural.template;

public abstract class CoffeeMachineTemplate {

    protected abstract void processBeans();

    protected abstract void processMilk();

    protected abstract void boil();

    public void pourToCup() {
        /**
         * pour to various cups based on the size
         */
    }

    public void serve() {
        processBeans();
        boil();
        processMilk();
        pourToCup();
    }

}
