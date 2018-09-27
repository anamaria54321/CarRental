package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.Engine;

public abstract class Dacia extends Car {
    public Dacia(String make,String model, Engine engine){
        super("Dacia", model, engine );
    }
}
