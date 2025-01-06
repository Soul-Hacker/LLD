package StrategyDesignPattern.Using.Strategy;

public class RacingDriveStrategy implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("Racing Drive");
    }
}
