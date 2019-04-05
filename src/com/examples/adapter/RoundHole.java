package com.examples.adapter;

public class RoundHole {
    private int radius;

    RoundHole(int radius){
        this.radius = radius;
    }

    public boolean fits(RoundPegInterface peg){
        if(peg.getRadius() < radius){
            return true;
        }
        return false;
    }

}
