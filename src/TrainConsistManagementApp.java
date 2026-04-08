import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedHashSet
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Add duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Step 4: Display formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);
    }
}