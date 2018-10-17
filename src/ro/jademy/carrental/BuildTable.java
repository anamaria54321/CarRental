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

    public int getLargestNameMake(List<Car> cars) {

        ArrayList<String> makeNumes = new ArrayList<>();
        for (Car car : cars) {
            makeNumes.add(car.getMake());
        }
        return largestString(makeNumes);
    }

    public int getLargestNameModel(List<Car> cars) {

        ArrayList<String> modelNumes = new ArrayList<>();
        for (Car car : cars) {
            modelNumes.add(car.getModel());
        }
        return largestString(modelNumes);
    }
    public int getLargestNameTransmissionType(List<Car> cars) {

        ArrayList<String> transmissionTypeNumes = new ArrayList<>();
        for (Car car : cars) {
            transmissionTypeNumes.add(car.getTransmissionType());
        }
        return largestString(transmissionTypeNumes);
    }

}
