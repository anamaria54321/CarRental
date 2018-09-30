package ro.jademy.carrental.car.Audi;

import ro.jademy.carrental.car.Engine;

import java.math.BigDecimal;

public class Q3 extends Audi {
    public Q3(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
              String color, String transmissionType, Integer year,BigDecimal basePrice,  String availability){
        super("Audi", "Q3", carType, engine, doorNumber, fuelType,
                color, transmissionType,year, basePrice, availability) ;
    }
}
