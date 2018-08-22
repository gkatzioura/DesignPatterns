package com.gkatzioura.design.structural.facade;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface UserUsageFacade {

    List<UserUsage> usageOn(UUID user, Date from, Double lat, Double lng);

}
