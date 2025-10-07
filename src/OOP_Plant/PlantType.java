package OOP_Plant;

public enum PlantType {
    CACTUS("mineral water", "centiliter"),
    PALM("tap water", "liter"),
    CARNIVOROUS("protein liquid", "liter");

    private final String liquid; //ENCAPSULATION PRIVATE
    private final String measurement;

    PlantType(String liquid, String measurement) {
        this.liquid=liquid;
        this.measurement=measurement;
    }

    public String getLiquid() { //ENCAPSULATION
        return liquid;
    }

    public String getMeasurement() { //ENCAPSULATION
        return measurement;
    }
}
