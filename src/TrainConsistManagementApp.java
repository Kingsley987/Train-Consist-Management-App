import java.util.*;

public class TrainConsistManagementApp {

    // 🔹 Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // 🔹 Passenger Bogie with validation
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // Validation (Fail-Fast)
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC14 - Custom Exception Validation ");
        System.out.println("=======================================\n");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // Invalid bogie
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}