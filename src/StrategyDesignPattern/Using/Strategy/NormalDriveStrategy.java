package StrategyDesignPattern.Using.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("NormalDrive");
    }
}
