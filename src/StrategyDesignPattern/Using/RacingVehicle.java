package StrategyDesignPattern.Using;

import StrategyDesignPattern.Using.Strategy.RacingDriveStrategy;

public class RacingVehicle extends Vehicle{
    public RacingVehicle()
    {
        super(new RacingDriveStrategy());
    }
}
