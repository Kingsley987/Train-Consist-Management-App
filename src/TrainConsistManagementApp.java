import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Code ");
        System.out.println("=====================================\n");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Step 1: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 2: Validate using Pattern.matches()
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // Step 3: Display results
        System.out.println("Train ID: " + trainId + " -> " +
                (isTrainValid ? "VALID" : "INVALID"));

        System.out.println("Cargo Code: " + cargoCode + " -> " +
                (isCargoValid ? "VALID" : "INVALID"));
    }
}