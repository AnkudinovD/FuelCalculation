package com.example.fuelcalculation;

public class Helicopter extends AirCraft{

    Helicopter(String name, int amountPassage, int maxSpeed, float fuelConsumption){
        super(name, amountPassage, maxSpeed, fuelConsumption);
    }

    //Возвращает количество минут
    @Override
    public float countTime(float kilometers) {
        return (kilometers/maxSpeed) * 60;
    }

    //Возвращает количество килограммов
    @Override
    public float countFuel(float kilometers) {
        return (kilometers/100) * 14;
    }

    public String getName(){
        return name;
    }
}
