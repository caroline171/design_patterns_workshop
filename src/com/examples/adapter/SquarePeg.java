package com.examples.adapter;

public class SquarePeg implements RoundPegInterface {
    private int side;

    SquarePeg(int side){
        this.side = side;
    }
    @Override
    public int getRadius() {
        return (int) Math.sqrt(2.0) * side;
    }
}
