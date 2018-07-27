package com.gkatzioura.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Lieutenant implements MilitaryPersonnel, Officer {

    private List<MilitaryPersonnel> lowerRankersonel = new ArrayList<>();

    public Lieutenant(List<MilitaryPersonnel> lowerRankersonel) {
        this.lowerRankersonel = lowerRankersonel;
    }

    public void addPrivateUnderCommand(Private soldier) {
        lowerRankersonel.add(soldier);
    }

    @Override
    public void executeOrder() {
        System.out.println("Lieutenant executing order assigned");

        //other actions
        this.lowerRankersonel.forEach(lw->assignOrder(lw));
        //other actions
    }

    @Override
    public void assignOrder(MilitaryPersonnel militaryPersonnel) {
        militaryPersonnel.executeOrder();
    }
}
