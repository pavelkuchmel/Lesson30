package com.company;

public class Car {
    public enum Body{SEDAN, COUPE, ROADSTER, CABRIOLET, VAGON};

    public Car(Body body, int power, String name){
        this.power = power;
        this.name = name;
        this.body = body;
    }

    private String name;
    private int power;
    public Body body;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", body=" + body +
                '}';
    }
}

