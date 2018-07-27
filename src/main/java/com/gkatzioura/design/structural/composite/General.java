package com.gkatzioura.design.structural.composite;

public class General implements  Officer {

    @Override
    public void assignOrder(MilitaryPersonnel militaryPersonnel) {
        militaryPersonnel.executeOrder();
    }
}
