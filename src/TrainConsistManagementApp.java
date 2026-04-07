import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 72));

        int totalSeats = bogieList.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        System.out.println("=== Total Seating Capacity ===\n");
        System.out.println("Total Seats: " + totalSeats);

        System.out.println("\nProgram Continues...");
    }
}
