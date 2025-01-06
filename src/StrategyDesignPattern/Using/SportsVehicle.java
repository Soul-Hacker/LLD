package StrategyDesignPattern.Using;

import StrategyDesignPattern.Using.Strategy.RacingDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new RacingDriveStrategy()); // Correct usage of super
    }
}
