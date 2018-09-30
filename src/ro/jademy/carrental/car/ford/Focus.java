package ro.jademy.carrental.car.ford;

import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public class Focus extends Ford{
    public Focus(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                 String color, String transmissionType, Integer year,BigDecimal basePrice,  String availability){
        super("Ford","Focus",carType,engine,doorNumber,fuelType,
                color,transmissionType,year,basePrice, availability);
    }
}
