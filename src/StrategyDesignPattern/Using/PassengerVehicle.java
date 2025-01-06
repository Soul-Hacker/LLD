package StrategyDesignPattern.Using;

import StrategyDesignPattern.Using.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
   public PassengerVehicle()
    {
        super(new NormalDriveStrategy());
    }
}