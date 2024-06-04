import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class GardenSimulationAPI {

    private List<Plant> plants = new ArrayList<Plant>();
    private List<Field> fields = new ArrayList<Field>();
    private WateringSystem wateringSystem = new WateringSystem();
    private PestControl pestControl = new PestControl();
    private Sensor sensor = new Sensor();
    private List<String> log = new ArrayList<>();

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
                int fertilizerCost = Integer.parseInt(values[2]);
                List<String> parasites = Arrays.asList(values[3].split("\\s*,\\s*"));
                Plant plant = new Plant(name, waterRequirement, fertilizerCost, parasites);
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
}
