import java.util.*;

public class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        private String type;
        private int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogieList = new ArrayList<>();

        try {
            bogieList.add(new PassengerBogie("Sleeper", 72));
            bogieList.add(new PassengerBogie("AC Chair", 56));
            bogieList.add(new PassengerBogie("First Class", 24));
            bogieList.add(new PassengerBogie("Invalid Bogie", -5));
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        System.out.println("\nValid Passenger Bogies:");
        for (PassengerBogie b : bogieList) {
            System.out.println(b.getType() + " - Capacity: " + b.getCapacity());
        }

        System.out.println("\nProgram Continues Safely...");
    }
}