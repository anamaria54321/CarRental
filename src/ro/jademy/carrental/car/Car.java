package ro.jademy.carrental.car;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    Engine engine = new Engine();
    public String carType;
    public Integer doorNumber;
    public Car(String make, String model,String carType, Engine engine, Integer doorNumber) {
        this.make = make;
        this.model = model;
        this.carType=carType;
        this.engine = engine;
    }

    // Q: how can we better represent the car type?
    public String carType; // coupe, sedan, hatchback, convertible, wagon, SUV

    // Q: how can we better represent the motor type?
    public String fuelType; // diesel, gasoline, alternative



    public String color;

    // Q: how can we better represent the transmission type?
    public String transmissionType; // automatic, manual

    // Q: how can we better represent the engine?
//    public String engine;

    // Q: how can we better represent money value?
    public String basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?
}
