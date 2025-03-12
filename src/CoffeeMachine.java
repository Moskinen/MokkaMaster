import java.util.ArrayList;
import java.util.Collections;

public class CoffeeMachine {
    public Cup serve(String drinkType, Size size, boolean whippedCream) {
        ArrayList<Cup> orderHistory = new ArrayList<>();

        Cup cup = null;

        switch (drinkType.toLowerCase()) {
            case "Sort kaffe":
                if (size == null) {
                    throw new IllegalArgumentException("Sort kaffe skal have en størrelse");
                }
                cup = new Cup("Sort kaffe", size, false);
                break;
            case "Espresso":
                if (size != null) {
                    throw new IllegalArgumentException("Espresso kan ikke have størrelse");
                }
                if (whippedCream) {
                    throw new IllegalArgumentException("Espresso kan ikke have flødeskum");
                }
                cup = new Cup("Espresso", size, false);
                break;
            case "Dobbelt espresso":
                if (size != null) {
                    throw new IllegalArgumentException("Dobbelt Espresso kan ikke have størrelse");
                }
                if (whippedCream) {
                    throw new IllegalArgumentException("Dobbelt Espresso kan ikke have flødeskum");
                }
                cup = new Cup("Dobbelt espresso", size, false);
                break;
            case "Tripple espresso":
                if (size != null) {
                    throw new IllegalArgumentException("Triple Espresso kan ikke have størrelse");
                }
                if (whippedCream) {
                    throw new IllegalArgumentException("Triple Espresso kan ikke have flødeskum");
                }
                cup = new Cup("Tripple espresso", size, false);
                break;
            case "Latte Machiatto":
                if (size == null) {
                    throw new IllegalArgumentException("Latte Machiatto skal have en størrelse");
                }
                if (whippedCream) {
                    throw new IllegalArgumentException("Latte Machiatto kan ikke have flødeskum");
                }
                cup = new Cup("Espresso", size, false);
                break;
            case "Kakaomælk":
                if (size == null) {
                    throw new IllegalArgumentException("Kakaomælk skal have en størrelse");
                }
                cup = new Cup("Espresso", size, whippedCream);
                break;
            case "Chokoladedrik":
                if (size == null) {
                    throw new IllegalArgumentException("Chokoladedrik skal have en størrelse");
                }
                cup = new Cup("Espresso", size, whippedCream);
                break;
            default:
                throw new IllegalArgumentException("Ukendt drik: " + drinkType);
        }
        orderHistory.add(cup);
        return cup;
    }

    public void printOrderHistory(ArrayList<Cup> orderHistory) {
        System.out.println("Order List");
        Collections.sort(orderHistory);
        for(Cup cup : orderHistory) {

        }
    }
}
