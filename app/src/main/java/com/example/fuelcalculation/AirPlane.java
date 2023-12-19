package com.example.fuelcalculation;

public class AirPlane extends AirCraft{

    AirPlane(String name, int amountPassage, int maxSpeed, float fuelConsumption){
        super(name, amountPassage, maxSpeed, fuelConsumption);
    }

    //Возвращает количество минут
    @Override
    public float countTime(float kilometers) {
        return (kilometers/maxSpeed) * 60;
    }

    //возвращает количество в тоннах
    @Override
    public float countFuel(float kilometers) {
        float fuelConsumptionMinute = fuelConsumption/60;
        return countTime(kilometers) * fuelConsumptionMinute;
    }
    public String getName(){
        return name;
    }
}
