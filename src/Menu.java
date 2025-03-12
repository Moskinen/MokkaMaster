import java.io.*;

public class Menu {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void drinksMachine(){

        System.out.println(ANSI_YELLOW +
                "Drinks Machine"
        + ANSI_RESET);

    }

    public static void drinkServed(String drink) {

        System.out.println("Serveret: " + drink);


    }

    public static void orderHistory(String order) {

        System.out.println("Udskriver sorteret bestillingshistorik:\n" +
                "Sorteret bestillingshistorik:"
                + order
        );

    }

    public static void mostOrdered(String mostOrdered) {

        System.out.println("Statistik over mest bestilite drik:\n" +
        "mest bestile drik er " + mostOrdered);

    }




}
