package ro.jademy.carrental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    private ArrayList<Salesman> salesmens = new ArrayList<>();

    public Shop(){
        Salesman person1 = new Salesman("Dogaru", "Catalina", "dogaru.catalina", "ab12");
        Salesman person2 = new Salesman("Filip", "Ion", "filip.ion", "cd34");
        Salesman person3 = new Salesman("Slavescu", "Marius", "slavescu.marius", "ef56");

        salesmens.addAll(Arrays.asList(person1, person2, person3));
    }

    // Q: what fields and methods should this class contain?

    public boolean login() {

        // TODO: implement a basic user login
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username and your password");

//        for (int i = 0; i < 3; i++) {

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

}



//    public void showMenu() {
//
//        System.out.println(" -----------------------------------------------");
//        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
//        System.out.println(" -----------------------------------------------");
//        System.out.println();
//        System.out.println("                    MAIN MENU                   ");
//        System.out.println("1. List all cars");
//        System.out.println("2. List available cars");
//        System.out.println("3. List rented cars");
//        System.out.println("4. Check income");
//        System.out.println("5. Logout");
//        System.out.println("6. Exit");
//    }
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

