package com.examples.Strategy;

import com.examples.Strategy.driving_startegies.BA7R;
import com.examples.Strategy.driving_startegies.WayOfDriving;

public class Main {
    public  static void main(String[] a){
        WayOfDriving driving = new BA7R();
        Montazah montazahRoute = new Montazah(driving);
        montazahRoute.takeRoute();
    }
}
