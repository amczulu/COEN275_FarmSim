public class Field {

    Plant plant;
    int currentWaterLevel;
    int currentFertilizerLevel;

    Field(Plant plant) {
        this.plant = plant;
        this.currentWaterLevel = 0;
        this.currentFertilizerLevel = 0;
    }
}
