package com.gkatzioura.design.structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SQLUsageReport implements UsageReport {

    @Override
    public List<Usage> report(UUID uuid) {

        return new ArrayList<>();
    }

}
