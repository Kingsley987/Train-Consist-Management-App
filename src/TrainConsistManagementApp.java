import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("=========================================\n");

        // Step 1: Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        // 🔹 Display bogies
        System.out.println("Goods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Step 2: Safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Step 3: Display result
        System.out.println("\nSafety Status: " +
                (isSafe ? "SAFE TRAIN" : "UNSAFE TRAIN"));
    }
}