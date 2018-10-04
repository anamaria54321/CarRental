package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public abstract class Dacia extends Car {
    public Dacia(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                 String color, String transmissionType, Integer year, BigDecimal basePrice) {

        super("Dacia", model, carType, engine, doorNumber, fuelType,
                color, transmissionType, year, basePrice);
    }
}
