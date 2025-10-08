package OOP_Plant;
//ARV & INTERFACE
public class Palm extends Plant {

    public Palm(String name, double lengthMeter) {
        super(name, lengthMeter, PlantType.PALM);
    }

    @Override
    public double liquidAmount() { //POLYMORFISM
        return 0.5 * getLengthMeter();
    }

    @Override
    public String getLiquid() { //POLYMORFISM
        return getType().getLiquid();
    }

    @Override
    public String getMeasurement() { //POLYMORFISM
        return getType().getMeasurement();
    }
}
