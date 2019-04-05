package com.examples.builder;

public class CarManualBuilder implements AutomobileBuilder {
    CarManual manual;
    @Override
    public AutomobileBuilder setSeats(int seats) {
        System.out.println("Seats set in car manual"+seats);
        return this;
    }

    @Override
    public AutomobileBuilder setColor(int color) {
        System.out.println("Color set in car manual"+color);
        return this;
    }

    public CarManual create(){
        return this.manual;
    }

}
