package com.examples.Strategy;

import com.examples.Strategy.driving_startegies.WayOfDriving;

public abstract class Route {

    WayOfDriving drivingMethod;

    abstract void takeRoute();
}
