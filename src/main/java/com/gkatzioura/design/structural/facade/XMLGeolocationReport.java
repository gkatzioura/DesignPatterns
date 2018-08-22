package com.gkatzioura.design.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class XMLGeolocationReport implements GeolocationReport {

    @Override
    public List<LocationInformation> generate(Double lat, Double lng, Double distance) {

        /**
         * http requests to retrieve the xml
         * iterate the xml using stax
        */

        return new ArrayList<>();
    }

}
