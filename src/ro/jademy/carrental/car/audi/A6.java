package ro.jademy.carrental.car.audi;

import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public class A6 extends Audi {
    public A6(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
              String color, String transmissionType, Integer year, BigDecimal basePrice) {
        super("Audi", "A6", carType, engine, doorNumber, fuelType,
                color, transmissionType, year, basePrice);

    }
}
