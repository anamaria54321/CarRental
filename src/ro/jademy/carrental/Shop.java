package ro.jademy.carrental;

import ro.jademy.carrental.car.Audi.A4;
import ro.jademy.carrental.car.Audi.A6;
import ro.jademy.carrental.car.Audi.Audi;
import ro.jademy.carrental.car.Audi.Q3;
import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.HeaderColumn;
import ro.jademy.carrental.car.HeaderColumn;
import ro.jademy.carrental.car.Salesman;
import ro.jademy.carrental.car.dacia.Dacia;
import ro.jademy.carrental.car.dacia.Duster;
import ro.jademy.carrental.car.dacia.Duster;
import ro.jademy.carrental.car.dacia.Logan;
import ro.jademy.carrental.car.dacia.Sandero;
import ro.jademy.carrental.car.ford.Fiesta;
import ro.jademy.carrental.car.ford.Focus;
import ro.jademy.carrental.car.ford.Ford;
import ro.jademy.carrental.car.ford.Ka;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    private ArrayList<Salesman> salesmens = new ArrayList<>();
    private ArrayList<Ford> fordCars = new ArrayList<>();
    private ArrayList<Dacia> daciaCars = new ArrayList<>();
    private ArrayList<Audi> audiCars = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<HeaderColumn> headerList = new ArrayList<>();


    public Shop() {
        Salesman s1 = new Salesman("Dogaru", "Catalina", "d.c", "ab12");
        Salesman s2 = new Salesman("Filip", "Ion", "f.c", "cd34");
        Salesman s3 = new Salesman("Slavescu", "Marius", "s.m", "ef56");

        salesmens.addAll(Arrays.asList(s1, s2, s3));

        Engine engineKa = new Engine(60, 1299);
        Engine engineFocus = new Engine(203, 2261);
        Engine engineFiesta = new Engine(90, 1560);

        Engine engineLogan = new Engine(75, 1149);
        Engine engineDuster = new Engine(105, 1598);
        Engine engineSandero = new Engine(90, 1461);

        Engine engineA4 = new Engine(110, 1896);
        Engine engineA6 = new Engine(133, 2309);
        Engine engineQ3 = new Engine(367, 2480);

        Ka ka = new Ka("Ford", "Ka", "Hatchback", engineKa, 3, "gazoline",
                "Red", "manual", 2001, new BigDecimal(12000), "Rented");
        Focus focus = new Focus("Ford", "Focus", "Hatchback", engineFocus, 5, "gasoline",
                "Black", "manual", 2005, new BigDecimal(14000), "Available");
        Fiesta fiesta = new Fiesta("Ford", "Fiesta", "hatchback", engineFiesta, 5, "diesel",
                "White", "automatic", 2010, new BigDecimal(15000), "Service");

        fordCars.addAll(Arrays.asList(ka, focus, fiesta));

        Logan logan = new Logan("Dacia", "Logan", "sedan", engineLogan, 4, "gazoline",
                "Blue", "manual", 2017, new BigDecimal(18000), "Available");
        Duster duster = new Duster("Dacia", "Duster", "SUV", engineDuster, 5, "gasoline",
                "Orange Atacama", "manual", 2018, new BigDecimal(22000), "Available");
        Sandero sandero = new Sandero("Dacia", "Sandero", "SUV", engineSandero, 5, "diesel",
                "Gris Platine", "automatic", 2016, new BigDecimal(20000), "Available");

        daciaCars.addAll(Arrays.asList(logan, duster, sandero));

        A4 a4 = new A4("Audi", "A4", "Sedan", engineA4, 4, "diesel",
                "Gray", "automatic", 2017, new BigDecimal(18000), "Available");
        A6 a6 = new A6("Audi", "A6", "Sedan", engineA6, 4, "gasoline",
                "Yellow", "manual", 2017, new BigDecimal(18000), "Rented");
        Q3 q3 = new Q3("Audi", "Q3", "SUV", engineQ3, 5, "gasoline",
                "Black", "automatic", 2017, new BigDecimal(18000), "Rented");

        cars.addAll(Arrays.asList(ka, focus, fiesta, logan, duster, sandero, a4, a6, q3));


        HeaderColumn hC1 = new HeaderColumn("MAKE");
        HeaderColumn hC2 = new HeaderColumn("MODEL");
        HeaderColumn hC3 = new HeaderColumn("CAR TYPE");
        HeaderColumn hC4 = new HeaderColumn("ENGINE");
        HeaderColumn hC5 = new HeaderColumn("DOORNUMBER");
        HeaderColumn hC6 = new HeaderColumn("FUELTYPE");
        HeaderColumn hC7 = new HeaderColumn("TRANSMISSIONTYPE");
        HeaderColumn hC8 = new HeaderColumn("YEAR");
        HeaderColumn hC9 = new HeaderColumn("BASEPRICE");
        HeaderColumn hC10 = new HeaderColumn("AVAILABILITY");

        headerList.addAll(Arrays.asList(hC1, hC2, hC3, hC4, hC5, hC6, hC7, hC8, hC9, hC10));
    }

    public void showListAllCars() {
        System.out.println();
        for (Car car : cars) {
            System.out.println(car.getMake() + "||" + car.getModel() + "||" + car.getCarType() + "||" + car.getEngine() + "||" +
                    car.getDoorNumber() + "||" + car.getFuelType() + "||" + car.getTransmissionType() + "||" + car.getYear() + "||"
                    + car.getBasePrice() + "||" + car.getAvailability());
        }
    }



    public void showHeaderList() {

        for (HeaderColumn headerColumn : headerList) {

            System.out.print(headerColumn.getColumnName() + "||");
        }
        System.out.println();
    }

    // Q: what fields and methods should this class contain?

    public boolean login() {

        // TODO: implement a basic user login
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username and your password");
        System.out.println("Username:");
        String username = scan.nextLine();
        for (Salesman salesman : salesmens) {
            if (username.equals(salesman.getUsername())) {
                System.out.println("Password:");
                String password = scan.nextLine();
                if (password.equals(salesman.getPassword())) {
                    System.out.println(username + " successfully logged in.");
                    return true;
                }
            }
        }
        System.out.println("Wrong username or password , try again.");
        return false;
    }


    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

//
//    public void showListMenuOptions() {
//
//        System.out.println("Select an action from below:");
//        System.out.println("1. Filter by make");
//        System.out.println("2. Filter by model");
//        System.out.println("3. Filter by budget");
//        // TODO: add additional filter methods based on car specs
//
//        System.out.println("4. Back to previous menu");
//
//    }
//
//    public void calculatePrice(int numberOfDays) {
//        // TODO: apply a discount to the base price of a car based on the number of rental days
//        // TODO: document the implemented discount algorithm
//
//        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
//        //       weekdays and national holidays in which the discount should be smaller
//
//        // Q: what should be the return type of this method?
//    }
}
