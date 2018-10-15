package ro.jademy.carrental.car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    public int compare(Car c1, Car c2) {

        if (c1.getMake().compareToIgnoreCase(c2.getMake()) != 0) {
            return c1.getMake().compareToIgnoreCase(c2.getMake());
        }
        if (c1.getModel().compareToIgnoreCase(c2.getModel()) != 0) {
            return c1.getModel().compareToIgnoreCase(c2.getModel());
        }
        if (c1.getCarType().compareToIgnoreCase(c2.getCarType()) != 0) {
            return c1.getCarType().compareToIgnoreCase(c2.getCarType());
        }
        if (c1.getEngine().compareTo(c2.getEngine()) != 0) {
            return c1.getEngine().compareTo(c2.getEngine());
        }
        if (c1.getDoorNumber().compareTo(c2.getDoorNumber()) != 0) {
            return c1.getDoorNumber().compareTo(c2.getDoorNumber());
        }
        if (c1.getFuelType().compareToIgnoreCase(c2.getFuelType()) != 0) {
            return c1.getFuelType().compareToIgnoreCase(c2.getFuelType());
        }
        if (c1.getColor().compareToIgnoreCase(c2.getColor()) != 0) {
            return c1.getColor().compareToIgnoreCase(c2.getColor());
        }
        if (c1.getTransmissionType().compareToIgnoreCase(c2.getTransmissionType()) != 0) {
            return c1.getTransmissionType().compareToIgnoreCase(c2.getTransmissionType());
        }
        if (c1.getYear().compareTo(c2.getYear()) != 0) {
            return c1.getYear().compareTo(c2.getYear());
        }
        if (c1.getBasePrice().compareTo(c2.getBasePrice()) != 0) {
            return c1.getBasePrice().compareTo(c2.getBasePrice());
        }
        return 0;

    }}

