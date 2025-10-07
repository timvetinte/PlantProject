package OOP_Plant;
//ARV & INTERFACE
public class Carnivorous extends Plant {

    public Carnivorous(String name, double lengthMeter) {
        super(name, lengthMeter, PlantType.CARNIVOROUS);
    }

    @Override
    public double liquidAmount() { //POLYMORFISM //ENCAPSULATION

        return 0.1 + (0.2 * getLengthMeter());
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
