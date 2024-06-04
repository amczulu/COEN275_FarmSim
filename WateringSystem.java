public class WateringSystem {

    void water(Field field, int amount) {
        field.currentWaterLevel += amount;
        System.out.println("Watering field with " + amount + " units.");
    }
}
