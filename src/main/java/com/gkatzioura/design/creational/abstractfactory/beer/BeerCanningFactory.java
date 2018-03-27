package com.gkatzioura.design.creational.abstractfactory.beer;

import com.gkatzioura.design.creational.abstractfactory.CanBody;
import com.gkatzioura.design.creational.abstractfactory.CanTop;
import com.gkatzioura.design.creational.abstractfactory.CanningFactory;

public class BeerCanningFactory extends CanningFactory {

    public CanTop createTop() {
        return new BeerCanTop();
    }

    public CanBody createBody() {
        return new BeerCanBody();
    }

}
