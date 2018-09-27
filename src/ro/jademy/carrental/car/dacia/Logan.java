package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.dacia.Dacia;

public class Logan extends Dacia {
   private Integer year;
    private String color;
    public Logan(String make,String model,Integer year, Engine engine){
        super("Dacia","Logan", engine);
        this.year =year;
    }
}
