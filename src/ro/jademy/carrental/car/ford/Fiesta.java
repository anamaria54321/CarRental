package ro.jademy.carrental.car.ford;

import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public class Fiesta extends Ford {
    public Fiesta(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                  String color, String transmissionType,Integer year, BigDecimal basePrice,  String availability){
        super("Ford","Fiesta",carType,engine,doorNumber,fuelType,
                color,transmissionType,year,basePrice, availability);
    }
}
