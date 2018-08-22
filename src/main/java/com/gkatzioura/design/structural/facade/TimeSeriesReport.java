package com.gkatzioura.design.structural.facade;

import java.util.Date;
import java.util.List;

public interface TimeSeriesReport {

    List<TimeInformation> generate(Date start, Date end);

}
