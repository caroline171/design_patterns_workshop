package com.examples.Strategy;

import com.examples.Strategy.driving_startegies.WayOfDriving;

public class Montazah extends Route {

    Montazah(WayOfDriving wayOfDriving){
        this.drivingMethod = wayOfDriving;
    }

    @Override
    void takeRoute() {
        this.drivingMethod.drive();
    }
}
