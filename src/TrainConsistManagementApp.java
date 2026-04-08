import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);
    }
}
