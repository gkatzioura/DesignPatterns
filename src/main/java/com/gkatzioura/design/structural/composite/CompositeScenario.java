package com.gkatzioura.design.structural.composite;

import java.util.Collections;

public class CompositeScenario {

    public static void main(String[] args) {

        Private ryan = new Private();
        Lieutenant lieutenant = new Lieutenant(Collections.singletonList(ryan));
        Major major = new Major(Collections.singletonList(lieutenant));
        General general = new General();
        general.assignOrder(major);
    }
}
