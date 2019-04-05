package com.examples.builder;

public class CarPlace {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder(new Car());
        carBuilder
                .setColor(2)
                .setSeats(4);
        Car car = carBuilder.create();
    }
}
