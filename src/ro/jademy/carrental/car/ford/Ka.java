package ro.jademy.carrental.car.ford;

import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public class Ka extends Ford {
    public Ka(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
              String color, String transmissionType, Integer year, BigDecimal basePrice) {
        super("Ford", "Ka", carType, engine, doorNumber, fuelType,
                color, transmissionType, year, basePrice);
    }
}
