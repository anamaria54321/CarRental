package ro.jademy.carrental.car.audi;

import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public class A4 extends Audi {
    public A4(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
              String color, String transmissionType, Integer year, BigDecimal basePrice) {
        super("audi", "A4", carType, engine, doorNumber, fuelType,
                color, transmissionType, year, basePrice);

    }
}
