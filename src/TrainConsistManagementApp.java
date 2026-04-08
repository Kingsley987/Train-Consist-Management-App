public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("============================================\n");

        // Step 1: Create bogie array (empty case)
        String[] bogieIds = {};

        // Step 2: Search key
        String searchId = "BG101";

        try {
            // 🔹 FAIL-FAST VALIDATION
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // 🔹 SEARCH LOGIC (only runs if data exists)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // 🔹 Display result
            if (found) {
                System.out.println("Bogie ID " + searchId + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchId + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}