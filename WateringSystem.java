public class WateringSystem {

    void water(Field field, int amount) {
        field.setCurrentWaterLevel(field.getCurrentWaterLevel() + amount);
        System.out.println("Watering field with " + amount + " units.");
    }
}
