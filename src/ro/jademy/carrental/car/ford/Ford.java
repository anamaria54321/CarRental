package ro.jademy.carrental.car.ford;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public abstract class Ford extends Car {
    public Ford(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                String color, String transmissionType, Integer year,BigDecimal basePrice,  String availability){
        super("Ford",model,carType,engine,doorNumber,fuelType,
    color,transmissionType,year,basePrice);
}
}
