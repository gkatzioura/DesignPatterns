package com.gkatzioura.design.creational.abstractfactory.food;

import com.gkatzioura.design.creational.abstractfactory.CanBody;
import com.gkatzioura.design.creational.abstractfactory.CanTop;
import com.gkatzioura.design.creational.abstractfactory.CanningFactory;

public class FoodCanningFactory extends CanningFactory {

    public CanTop createTop() {
        return new FoodCanTop();
    }

    public CanBody createBody() {
        return new FoodCanBody();
    }

}
