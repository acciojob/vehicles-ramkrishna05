package com.driver;

public class Vehicle {
    private String name;
    protected int currentSpeed; // Change access modifier to protected
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Vehicle is moving at speed: " + speed + " in direction: " + direction + " degrees.");
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle is steering to direction: " + currentDirection + " degrees.");
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("Vehicle has stopped.");
    }

    protected int getCurrentSpeed() { // Protected getter method for currentSpeed
        return currentSpeed;
    }
    protected int getCurrentDirection() { // Protected getter method for currentDirection
        return currentDirection;
    }
}

