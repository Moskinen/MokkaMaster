public enum Drinks {
    BLACK_COFFEE("Sort Kaffe"),
    ESPRESSO("Espresso"),
    DOUBLE_ESPRESSO("Dobbelt Espresso"),
    TRIPLE_ESPRESSO("Triple Espresso"),
    LATTE_MACHIATTO("Latte Machiato"),
    KAKAOMÆLK("Kakao mælk"),
    CHOKOLADEDRIK("Chokoladedrik")
    ;

    private final String name;


    Drinks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
