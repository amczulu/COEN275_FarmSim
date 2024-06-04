public class Sensor {

    // TODO: change threshold to be per plant type from field
    boolean needsWater(Field field, int threshold) {
        return field.currentWaterLevel < threshold;
    }

    boolean needsFertilizer(Field field, int threshold) {
        return field.currentFertilizerLevel < threshold;
    }
}
