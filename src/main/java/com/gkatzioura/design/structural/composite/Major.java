package com.gkatzioura.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Major implements MilitaryPersonnel, Officer {

    private List<MilitaryPersonnel> lowerRankersonel = new ArrayList<>();

    public Major(List<MilitaryPersonnel> lowerRankersonel) {
        this.lowerRankersonel = lowerRankersonel;
    }

    public void addPrivateUnderCommand(Private soldier) {
        lowerRankersonel.add(soldier);
    }

    public void addLieutenantUnderCommand(Lieutenant lieutenant) {
        lowerRankersonel.add(lieutenant);
    }

    @Override
    public void executeOrder() {
        System.out.println("Major executing order assigned");
        //other actions
        this.lowerRankersonel.forEach(lw->assignOrder(lw));
        //other actions
    }

    @Override
    public void assignOrder(MilitaryPersonnel militaryPersonnel) {
        militaryPersonnel.executeOrder();
    }

}
