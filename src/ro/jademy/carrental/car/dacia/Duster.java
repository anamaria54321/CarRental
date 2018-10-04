package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public class Duster extends Dacia {
    public Duster(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                  String color, String transmissionType, Integer year, BigDecimal basePrice) {

        super("Dacia", "Duster", carType, engine, doorNumber, fuelType,
                color, transmissionType, year, basePrice);
    }
}
