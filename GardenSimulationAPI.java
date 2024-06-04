import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class GardenSimulationAPI {

    private List<Plant> plants = new ArrayList<Plant>();
    private List<Field> fields = new ArrayList<Field>();
    private WateringSystem wateringSystem = new WateringSystem();
    private PestControl pestControl = new PestControl();
    private Sensor sensor = new Sensor();
    private List<String> log = new ArrayList<>();
    private int dayCounter = 0;

    public void initializeGarden(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Skip header line
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                String name = values[0];
                int waterRequirement = Integer.parseInt(values[1]);
                int waterMax = Integer.parseInt(values[2]);
                int fertilizerCost = Integer.parseInt(values[3]);
                List<String> parasites = Arrays.asList(values[4].split("\\s*,\\s*"));
                Plant plant = new Plant(name, waterRequirement, waterMax, fertilizerCost, parasites);
                plants.add(plant);
            }

            // Assign a plant to each field
            for (int i = 0; i < 4; i++) {
                fields.add(new Field(plants.get(i % plants.size())));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Object> getPlants() {}



    public void rain(int amount) {}
    public void fertilize(int amount) {}
    public void parasite(String parasite) {}

    public void checkAndWaterPlants() {}

    public void advanceDay() {}

    public void getState() {}

    private void logEvent(String event) {}

    public static void main(String[] args) {}

}
