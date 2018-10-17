package ro.jademy.carrental;

import ro.jademy.carrental.car.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildTable {
    public List<String> stringList = new ArrayList<>();
    public List<Car> cars = new ArrayList<>();


    private int largestString(ArrayList<String> stringList) {
        int max = 0;
        for (String s : stringList) {
            if (s.length() >= max) {
                max = s.length();
            }
        }
        return max;
    }

    public String getNameWithTraillingSpaces(String name, int largestNameCount) {
        String spaces = "";
        int nrSpaces = largestNameCount - name.length();
        for (int i = 0; i < nrSpaces + 2; i++) {
            spaces += " ";
        }
        return name + spaces;
    }

    public int getMakeLargestName(List<Car> cars) {

        ArrayList<String> makeNumes = new ArrayList<>();
        for (Car car : cars) {
            makeNumes.add(car.getMake());
        }
        return largestString(makeNumes);
    }

    public int getModelLargestName(List<Car> cars) {

        ArrayList<String> modelNumes = new ArrayList<>();
        for (Car car : cars) {
            modelNumes.add(car.getModel());
        }
        return largestString(modelNumes);
    }

    public int getTransmissionTypeLargestName(List<Car> cars) {

        ArrayList<String> transmissionTypeNumes = new ArrayList<>();
        for (Car car : cars) {
            transmissionTypeNumes.add(car.getTransmissionType());
        }
        return largestString(transmissionTypeNumes);
    }

    public int getFuelTypeLargestName(List<Car> cars) {

        ArrayList<String> fuelTypeNumes = new ArrayList<>();
        for (Car car : cars) {
            fuelTypeNumes.add(car.getFuelType());
        }
        return largestString(fuelTypeNumes);
    }

    //    public int getDoorNumberLargest(List<Car> cars) {
//
//        ArrayList<Integer> doorNumber = new ArrayList<>();
//        for (Car car : cars) {
//            doorNumber.add(car.getDoorNumber());
//        }
//        return largestString( doorNumber.);
//    }
    public int getColorLargestName(List<Car> cars) {

        ArrayList<String> colorNumes = new ArrayList<>();
        for (Car car : cars) {
            colorNumes.add(car.getColor());
        }
        return largestString(colorNumes);
    }
}
