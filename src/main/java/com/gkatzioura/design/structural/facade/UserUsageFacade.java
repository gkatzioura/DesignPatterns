package com.gkatzioura.design.structural.facade;

import java.util.Date;
import java.util.UUID;

public interface UserUsageFacade {

    String[][] usageOn(UUID user, Date from, Double lat,Double lng);

}
