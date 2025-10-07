package OOP_Plant;
//ARV & INTERFACE
public class Palm extends Plant {

    public Palm(String name, double lengthMeter) {
        super(name, lengthMeter, PlantType.PALM);
    }

    @Override
    public double liquidAmount() { //POLYMORFISM //ENCAPSULATION
        return 0.5 * getLengthMeter();
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
