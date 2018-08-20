package com.gkatzioura.design.structural.facade;

import java.util.UUID;

public class SQLUsageReport implements UsageReport {

    @Override
    public String[][] report(UUID uuid) {
        return new String[0][];
    }

}
