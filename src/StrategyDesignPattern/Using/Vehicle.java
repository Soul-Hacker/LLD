package StrategyDesignPattern.Using;

import StrategyDesignPattern.Using.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveobj;
    Vehicle(DriveStrategy driveobj)
    {
        this.driveobj=driveobj;
    }
    public void drive()
    {
        driveobj.Drive();
    }
}
