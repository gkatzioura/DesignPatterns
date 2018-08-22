package com.gkatzioura.design.structural.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class UserUsageFacadeImpl implements UserUsageFacade {

    private final GeolocationReport geolocationReport;
    private final TimeSeriesReport timeSeriesReport;
    private final UsageReport usageReport;

    private final double DEFAULT_DISTANCE = 20d;
    private final int DEFAULT_TIME_RANGE = 20;

    public UserUsageFacadeImpl(GeolocationReport geolocationReport, TimeSeriesReport timeSeriesReport, UsageReport usageReport) {
        this.geolocationReport = geolocationReport;
        this.timeSeriesReport = timeSeriesReport;
        this.usageReport = usageReport;
    }

    @Override
    public List<UserUsage> usageOn(UUID user, Date from, Double lat, Double lng) {

        List<LocationInformation> locationInformationData = geolocationReport.generate(lat, lng, DEFAULT_DISTANCE);
        Date to = Date.from(from.toInstant().plusSeconds(DEFAULT_TIME_RANGE));
        List<TimeInformation> timeSetiesData = timeSeriesReport.generate(from, to);
        List<Usage> usageData = usageReport.report(user);

        /**
         * Generate the report based on the data retrieved
         */

        return new ArrayList<>();
    }
}
