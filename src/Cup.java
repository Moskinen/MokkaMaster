public class Cup {

    private String drinkType;
    private Size size;
    private boolean hasWhippedCream;

    public Cup(String drinkType, Size size, boolean hasWhippedCream) {
        this.drinkType = drinkType;
        this.size = size;
        this.hasWhippedCream = hasWhippedCream;
    }

    public Cup(String drinkType) {
        this.drinkType = drinkType;
    }


    public Cup(String drinkType, Size size) {
        this.drinkType = drinkType;
        this.size = size;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isHasWhippedCream() {
        return hasWhippedCream;
    }

    public void setHasWhippedCream(boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "drinkType='" + drinkType + '\'' +
                ", size=" + size +
                ", hasWhippedCream=" + hasWhippedCream +
                '}';
    }
}
