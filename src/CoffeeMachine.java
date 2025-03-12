import java.util.ArrayList;

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
                Cup = new Cup("Sort Kaffe", size);
                break;
            case "Tripple espresso":
                Cup = new Cup("Sort Kaffe", size);
                break;
            case "Latte Machiatto":
                Cup = new Cup("Sort Kaffe", size);
                break;
            case "Kakaomælk":
                Cup = new Cup("Sort Kaffe", size, hasWhippedCream);
                break;
            case "Chokoladedrik":
                Cup = new Cup("Sort Kaffe", size, hasWhippedCream);
                break;
            default:
                throw new IllegalArgumentException("Ukendt drik: " + drinkType);
        }
        return cup;
    }
}
