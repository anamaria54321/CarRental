package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.dacia.Dacia;

import java.math.BigDecimal;

public class Logan extends Dacia {

    public Logan(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                 String color, String transmissionType, Integer year,BigDecimal basePrice,  String availability){
        super("Dacia","Logan",carType, engine, doorNumber, fuelType,
                color, transmissionType,year, basePrice, availability );

    }
}
