package com.examples.adapter;

public class Main {

    public static void main(String[] args){

        SquarePeg peg = new SquarePeg(5);
        RoundHole hole = new RoundHole(0);
        System.out.println(hole.fits(peg));
    }
}
