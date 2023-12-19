package com.example.fuelcalculation;

public abstract class AirCraft implements FuelConsumption, AmountTime{

    protected String name;
    protected int amountPassage;
    protected int maxSpeed;
    protected float fuelConsumption;

    AirCraft(String name, int amountPassage, int maxSpeed, float fuelConsumption){
        this.name = name;
        this.amountPassage = amountPassage;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

}
