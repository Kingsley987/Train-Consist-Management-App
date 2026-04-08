import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC17 - Sorting Bogie Names using Arrays.sort() ");
        System.out.println("===========================================\n");

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        // 🔹 Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 2: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // 🔹 Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}