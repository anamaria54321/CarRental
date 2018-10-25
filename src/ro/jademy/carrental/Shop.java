package ro.jademy.carrental;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.audi.A4;
import ro.jademy.carrental.car.audi.A6;
import ro.jademy.carrental.car.audi.Q3;
import ro.jademy.carrental.person.Salesman;
import ro.jademy.carrental.car.dacia.Duster;
import ro.jademy.carrental.car.dacia.Logan;
import ro.jademy.carrental.car.dacia.Sandero;
import ro.jademy.carrental.car.ford.Fiesta;
import ro.jademy.carrental.car.ford.Focus;
import ro.jademy.carrental.car.ford.Ka;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Shop {
    private ArrayList<Salesman> salesmens = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private ArrayList<HeaderColumn> headerList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    BuildTable table = new BuildTable();


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
        Engine engineQ4 = new Engine(367, 2580);

        Ka ka = new Ka("Ford", "Ka", "Hatchback", engineKa, 3, "gazoline",
                "Red", "manual", 2001, new BigDecimal(12));

//        ka.rentCar(new Date(), new GregorianCalendar(2018, Month.OCTOBER.ordinal(), 11).getTime());

        Focus focus = new Focus("Ford", "Focus", "Hatchback", engineFocus, 5, "gasoline",
                "Black", "manual", 2005, new BigDecimal(14000));
        Fiesta fiesta = new Fiesta("Ford", "Fiesta", "hatchback", engineFiesta, 5, "diesel",
                "White", "automatic", 2010, new BigDecimal(15000));

//        fiesta.rentCar(new Date(), new GregorianCalendar(2018, Month.OCTOBER.ordinal(), 12).getTime());

        Logan logan = new Logan("Dacia", "Logan", "sedan", engineLogan, 4, "gazoline",
                "Blue", "manual", 2017, new BigDecimal(18));
        Duster duster = new Duster("Dacia", "Duster", "SUV", engineDuster, 5, "gasoline",
                "Orange Atacama", "manual", 2018, new BigDecimal(22000));
        Sandero sandero = new Sandero("Dacia", "Sandero", "SUV", engineSandero, 5, "diesel",
                "Gris Platine", "automatic", 2016, new BigDecimal(20000));

        A4 a4 = new A4("Audi", "A4", "Sedan", engineA4, 4, "diesel",
                "Gray", "automatic", 2017, new BigDecimal(18000));
        A6 a6 = new A6("Audi", "A6", "Sedan", engineA6, 4, "gasoline",
                "Yellow", "manual", 2017, new BigDecimal(18000));
        Q3 q3 = new Q3("Audi", "Q3", "SUV", engineQ3, 5, "gasoline",
                "Black", "automatic", 2017, new BigDecimal(18000));
        Q3 q4 = new Q3("Audi", "Q3", "SUV", engineQ3, 5, "gasoline",
                "Wite", "automatic", 2017, new BigDecimal(18000));
        Q3 q5 = new Q3("Audi", "Q3", "SUV", engineQ4, 5, "gasoline",
                "Wite", "automatic", 2017, new BigDecimal(18000));
        cars.addAll(Arrays.asList(ka, focus, fiesta, logan, duster, sandero, a4, a6, q3, q4, q5));

    }

    public List<Car> filterCars(Predicate<Car> predicate) {
        return cars.stream().filter(predicate).collect(Collectors.toList());
    }
//    public List<Car> availableOrRentedCars(Predicate<Car> predicate) {
//        return cars.stream().filter(predicate).collect(Collectors.toList());
//    }

    public void login() {
        boolean isLogin = false;
        do {
            System.out.println("Please enter your username and your password");
            System.out.println("Username:");
            String username = sc.nextLine();
            for (Salesman salesman : salesmens) {
                if (username.equals(salesman.getUsername())) {
                    System.out.println("Password:");
                    String password = sc.nextLine();
                    if (password.equals(salesman.getPassword())) {
                        System.out.println(username + " successfully logged in.");
                        isLogin = true;
                    }
                }
            }
            System.out.println("Wrong username or password , try again.");
        } while (!isLogin);

    }

    public void carRental() {
        System.out.println();
        System.out.println("Enter the desired car  model ");
        String carModel = sc.next();

        GregorianCalendar startDate = new GregorianCalendar();
        GregorianCalendar endDate = new GregorianCalendar();
        for (Car car : cars) {
            if (car.getModel().equals(carModel)) {
                System.out.println("Enter start date");
                startDate = dateEnter();
                System.out.println("Enter end date");
                endDate = dateEnter();
                car.rentCar(startDate, endDate);
                System.out.println(startDate.getTime());
                System.out.println(endDate.getTime());
                showHeader();
                car.showCarSpecifications();
            }
        }
    }

    public GregorianCalendar dateEnter() {
        GregorianCalendar date = new GregorianCalendar();
        System.out.println("Enter Year ");
        int year = sc.nextInt();
        System.out.println("Enter Month ");
        int month = sc.nextInt();
        System.out.println("Enter Day ");
        int day = sc.nextInt();
        date.set(GregorianCalendar.YEAR, year);
        date.set(GregorianCalendar.MONTH, (month - 1));
        date.set(GregorianCalendar.DATE, day);
        return date;

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
        System.out.println("4. Car rental");
        System.out.println("5. Check income");
        System.out.println("6. Sort car");
        System.out.println("7. Logout");
        System.out.println("8. Exit");

        optionMenu();
    }

    public void optionMenu() {

        System.out.println("Select an action from below:");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                showListAllCars();
                showListMenuOptions();
                break;
            case 2:
                showListAvailableCars();
                showListMenuOptions();
                break;
            case 3:
                showListRentedCars();
                showListMenuOptions();
                break;
            case 4:
                carRental();
                showMenu();
                break;
            case 5:
                checkIncome();
                showMenu();
                break;
            case 6:
                sortList();
                showMenu();
                break;
            case 7:
                login();
                break;
            case 8:
                System.exit(0);
                break;
        }
    }

    public void sortList() {
        List<Car> carsCopy = new ArrayList<>(cars);
        System.out.println();
        showHeader();
        System.out.println();
        carsCopy.stream().sorted().forEach(car -> car.showCarSpecifications());
//        Collections.sort(carsCopy);
//        for (Car car : carsCopy) {
//            car.showCarSpecifications();
//        }

    }

    public void showHeader() {
        String header = String.format("|| %-10s || %-10s || %-10s || %-28s || %-5s || %-10s || %-15s || %-15s || %-10s " +
                        "|| %-10s ||", "MAKE", "MODEL", "CARTYPE", "ENGINE(HorsePawer/Capacity)",
                "DOORS", "FUELTYPE", "COLOR", "TRANSMISIONTYPE", "YEAR", "BASEPRICE");
        String header1 = String.format("|| %-38s || %-12s || %-12s ||", " ", "HorsePawer", "Capacity");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------");
        System.out.println(header);
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------");
        System.out.println(header1);
        System.out.println("==========================================================================================" +
                "=========================================================================================");
    }

    public void showListAllCars() {
        System.out.println();
        showHeader();
        System.out.println();
        cars.stream().forEach(car -> car.showCarSpecifications());
//        for (Car car : cars) {
//            car.showCarSpecifications();
//        }
    }

    public void showListAvailableCars() {
        System.out.println();
        showHeader();
        System.out.println();

        cars.stream().filter(car ->!car.getCarState().isRented()).forEach(car -> car.showCarSpecifications());
//        sau
        filterCars(car ->!car.getCarState().isRented()).stream().forEach(car -> car.showCarSpecifications());
//        for (Car car : cars) {
//            if (!car.getCarState().isRented()) {
//                car.showCarSpecifications();
//            }
//        }
    }

    public void showListRentedCars() {
        System.out.println();
        showHeader();
        System.out.println();
        filterCars(car ->car.getCarState().isRented()).stream().forEach(car -> car.showCarSpecifications());
//        for (Car car : cars) {
//            if (car.getCarState().isRented()) {
//                car.showCarSpecifications();
//            }
//        }
    }

    public void checkIncome() {
        BigDecimal sum = new BigDecimal(0);
        BigDecimal finalPrice = new BigDecimal(0);
        CarState carState = new CarState();
        for (Car car : cars) {
            if (car.getCarState().isRented()) {
                GregorianCalendar startDate = carState.getStartDate();
                GregorianCalendar endDate = carState.getStartDate();
                ;
                finalPrice = daysBetween(startDate, endDate).multiply(car.getBasePrice());
                sum = sum.add(finalPrice);
                System.out.println(sum);
            }
        }
    }

    public BigDecimal check(BigDecimal n) {
        return null;
    }


    public void showListMenuOptions() {
        System.out.println();
        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        System.out.println("4. Back to previous menu");

        optionsListMenu();
    }

    public void optionsListMenu() {
        System.out.println();
        System.out.println("Select an action from below:");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                showFilterByMake();
                showListMenuOptions();
                break;
            case 2:
                showFilterByModel();
                showListMenuOptions();
                break;
            case 3:
                showFilterByBudget();
                showListMenuOptions();
                break;
            case 4:
                showMenu();
                break;
        }
    }

    public void showFilterByMake() {
        System.out.println();
        System.out.println("Insert the desired car");
        String makeCar = sc.next();
        showHeader();
        filterCars(car -> car.getMake().equals(makeCar))
                .stream().forEach(car -> car.showCarSpecifications());

//        for (Car car : cars) {
//            if (car.getMake().equals(makeCar)) {
//                car.showCarSpecifications();
//            }
//        }
    }

    public void showFilterByModel() {
        System.out.println();
        System.out.println("Insert the desired car");
        String modelCar = sc.next();
        showHeader();

        filterCars(car -> car.getModel().equals(modelCar))
                .stream().forEach(car -> car.showCarSpecifications());
//        for (Car car : cars) {
//            if (car.getModel().equals(modelCar)) {
//                car.showCarSpecifications();
//            }
//        }
    }

    public void showFilterByBudget() {
        System.out.println();
        System.out.println("Enter the available amount");
        BigDecimal availableAmount = sc.nextBigDecimal();
        showHeader();
        filterCars(car -> car.getBasePrice().compareTo(availableAmount) == -1
                || car.getBasePrice().compareTo(availableAmount) == 0)
                .stream().forEach(car -> car.showCarSpecifications());
//        for (Car car : cars) {
//            if (car.getBasePrice().compareTo(availableAmount) == -1
//                    || car.getBasePrice().compareTo(availableAmount) == 0) {
//                car.showCarSpecifications();
//            }
//        }
    }

    public BigDecimal daysBetween(GregorianCalendar startDate, GregorianCalendar endDate) {
        long differenceInSeconds = (endDate.getTimeInMillis() - startDate.getTimeInMillis()) / (1000 * 60 * 60 * 24);
        return new BigDecimal(differenceInSeconds);

    }

    //    public void calculatePrice(int numberOfDays) {
//        // TODO: apply a discount to the base price of a car based on the number of rental days
//        // TODO: document the implemented discount algorithm
//
//        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
//        //       weekdays and national holidays in which the discount should be smaller
//
//        // Q: what should be the return type of this method?
//    }
    public void showTable() {

        for (Car car : cars) {

//        if((car.getMake().length()<=table.getMakeLargestName(cars))&&(car.getModel().length()<=table.getModelLargestName(cars))
//        &&(car.getTransmissionType().length()<=table.getTransmissionTypeLargestName(cars))&&
//                (car.getColor().length()<=table.getColorLargestName(cars)))
            System.out.print("|");

            System.out.print((table.getNameWithTraillingSpaces(car.getMake(), table.getMakeLargestName(cars))) + "|");
            System.out.print((table.getNameWithTraillingSpaces(car.getModel(), table.getModelLargestName(cars))) + "|");
            System.out.print((table.getNameWithTraillingSpaces(car.getTransmissionType(), table.getTransmissionTypeLargestName(cars))) + "|");
            System.out.print((table.getNameWithTraillingSpaces(car.getColor(), table.getColorLargestName(cars))) + "|");
            System.out.print((table.getNameWithTraillingSpaces(car.getDoorNumber().toString(), table.getDoorNumberLargest(cars))) + "|");
            System.out.print((table.getNameWithTraillingSpaces(car.getBasePrice().toString(), table.getBasePriceLargest(cars))) + "|");
            System.out.println("");
        }
    }
}
