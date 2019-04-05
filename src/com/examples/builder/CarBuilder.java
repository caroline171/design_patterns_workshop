package com.examples.builder;

public class CarBuilder implements AutomobileBuilder{

    private Car car;
    CarBuilder(Car car){
        this.car = car;
    }

    @Override
    public AutomobileBuilder setSeats(int seats) {
        System.out.println("Seats set in car"+seats);
        return this;
    }

    @Override
    public AutomobileBuilder setColor(int color) {
        System.out.println("Color set in car"+color);
        return this;
    }

    public Car create(){
        return this.car;
    }
}
