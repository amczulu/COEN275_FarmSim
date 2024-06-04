import java.util.List;

public class Plant {

    private String name;
    private int waterRequirement;
    private int waterMax;
    private int fertilizerCost;
    private List<String> parasites;

    public Plant(String name, int waterRequirement, int waterMax, int fertilizerCost, List<String> parasites) {
        this.name = name;
        this.waterRequirement = waterRequirement;
        this.waterMax = waterMax;
        this.fertilizerCost = fertilizerCost;
        this.parasites = parasites;
    }

    public String getName() {return name;}
    public int getWaterRequirement() {return waterRequirement;}
    public int getWaterMax() {return waterMax;}
    public int getFertilizerCost() {return fertilizerCost;}
    public List<String> getParasites() {return parasites;}

    // I don't think we need setters
}
