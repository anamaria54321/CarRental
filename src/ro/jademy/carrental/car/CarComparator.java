package ro.jademy.carrental.car;

import java.util.Comparator;

public  class CarComparator implements Comparator<Car> {

    public  int compare(Car c1, Car c2) {

        if (c1.getMake().compareToIgnoreCase(c2.getMake()) == 0) {
            if (c1.getModel().compareToIgnoreCase(c2.getModel()) == 0) {
                if (c1.getCarType().compareToIgnoreCase(c2.getCarType()) == 0) {
                    if (c1.getEngine().compareTo(c2.getEngine()) == 0) {
                        if (c1.getDoorNumber().compareTo(c2.getDoorNumber()) == 0) {
                            if (c1.getFuelType().compareToIgnoreCase(c2.getFuelType()) == 0) {
                                if (c1.getColor().compareToIgnoreCase(c2.getColor()) == 0){
                                    if (c1.getTransmissionType().compareToIgnoreCase(c2.getTransmissionType()) == 0){
                                        if (c1.getYear().compareTo(c2.getYear()) == 0){
                                            if (c1.getBasePrice().compareTo(c2.getBasePrice()) == 0){
                                            }
                                            return c1.getBasePrice().compareTo(c2.getBasePrice());
                                        }
                                        return c1.getYear().compareTo(c2.getYear());
                                    }
                                    return c1.getTransmissionType().compareToIgnoreCase(c2.getTransmissionType());
                                }
                                return c1.getColor().compareToIgnoreCase(c2.getColor());
                            }
                            return c1.getFuelType().compareToIgnoreCase(c2.getFuelType());
                        }
                        return c1.getDoorNumber().compareTo(c2.getDoorNumber());
                    }
                    return c1.getEngine().compareTo(c2.getEngine());
                }
                return c1.getCarType().compareToIgnoreCase(c2.getCarType());
            }
            return c1.getModel().compareToIgnoreCase(c2.getModel());
        }
        return c1.getMake().compareToIgnoreCase(c2.getMake());
    }
}
