package ro.jademy.carrental.car.Audi;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public abstract class Audi extends Car {
    public Audi(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                String color, String transmissionType, Integer year, BigDecimal basePrice,  String availability) {
        super("Audi", model, carType, engine, doorNumber, fuelType,
                color, transmissionType, year, basePrice, availability);
    }
}
