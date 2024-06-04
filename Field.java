public class Field {

    private Plant plant;
    private int currentWaterLevel;
    private int currentFertilizerLevel;
    private boolean isAlive;

    Field(Plant plant) {
        this.plant = plant;
        this.currentWaterLevel = 0;
        this.currentFertilizerLevel = 0;
        this.isAlive = true;
    }

    public Plant getPlant() {return plant;}
    public int getCurrentWaterLevel() {return currentWaterLevel;}
    public int getCurrentFertilizerLevel() {return currentFertilizerLevel;}
    public boolean isAlive() {return isAlive;}

    public void setPlant(Plant plant) {this.plant = plant;}
    public void setCurrentWaterLevel(int currentWaterLevel) {this.currentWaterLevel = currentWaterLevel;}
    public void setCurrentFertilizerLevel(int fertilizerLevel) {this.currentFertilizerLevel = fertilizerLevel;}
    public void setAlive(boolean alive) {this.isAlive = alive;}

}
