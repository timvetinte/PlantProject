package OOP_Plant;
//ARV & INTERFACE
public class Cactus extends Plant {

    private static final int cactusDefaultAmount = 2;

    public Cactus(String name, double lengthMeter) {
        super(name, lengthMeter, PlantType.CACTUS);
    }

    @Override
    public double liquidAmount() { //POLYMORFISM //ENCAPSULATION

        return cactusDefaultAmount;
    }

    @Override
    public String getLiquid() { //INTERFACE POLYMORFISM //ENCAPSULATION
        return getType().getLiquid();
    }

    @Override
    public String getMeasurement() { //INTERFACE POLYMORFISM //ENCAPSULATION
        return getType().getMeasurement();
    }
}
