package com.examples.Strategy;

import com.examples.Strategy.driving_startegies.WayOfDriving;

public class Sotar extends Route {

    Sotar(WayOfDriving wayOfDriving){
        this.drivingMethod = wayOfDriving;
    }

    @Override
    void takeRoute() {
        System.out.println("ABO 2er");
    }
}
