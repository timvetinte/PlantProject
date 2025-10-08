package OOP_Plant;

import java.util.ArrayList;

public abstract class Plant implements Sustenance{

    private double lengthMeter; //ENCAPSULATION
    private String name;
    private PlantType type;
    private static ArrayList<Plant> plantList = new ArrayList<>();

    public Plant(String name, double lengthMeter, PlantType type){
        this.lengthMeter = lengthMeter;
        this.name=name;
        this.type=type;
        plantList.add(this);

    }

    public double getLengthMeter() {
        return lengthMeter;
    }

    public String getName() {
        return name;
    }

    public PlantType getType() {
        return type;
    }

    public static ArrayList<Plant> getPlantList() {
        return plantList;
    }


}
