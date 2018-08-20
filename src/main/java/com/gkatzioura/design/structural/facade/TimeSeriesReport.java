package com.gkatzioura.design.structural.facade;

import java.util.Date;

public interface TimeSeriesReport {

    String[][] generate(Date start,Date end);

}
