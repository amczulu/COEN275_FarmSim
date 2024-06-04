import java.util.List;

public class Plant {

    String name;
    int waterRequirement;
    int fertilizerCost;
    List<String> parasites;

    public Plant(String name, int waterRequirement, int fertilizerCost, List<String> parasites) {
        this.name = name;
        this.waterRequirement = waterRequirement;
        this.fertilizerCost = fertilizerCost;
        this.parasites = parasites;
    }
}
