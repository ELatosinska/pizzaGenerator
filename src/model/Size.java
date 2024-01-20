package model;

public enum Size {
    SMALL(1), MEDIUM(1.2), LARGE(1.5), GIANT(2.0);

    public final double priceMultiplier;

    Size(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }
}
