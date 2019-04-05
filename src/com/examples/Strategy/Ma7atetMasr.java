package com.examples.Strategy;

import com.examples.Strategy.driving_startegies.WayOfDriving;

public class Ma7atetMasr extends Route {

    Ma7atetMasr(WayOfDriving wayOfDriving){
        this.drivingMethod = wayOfDriving;
    }

    @Override
    void takeRoute() {
        System.out.println("BA7r");
    }
}
