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

        public void display() {
            System.out.println(name + " - Capacity: " + capacity);
        }
    }

    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.getCapacity() > 50)
                .collect(Collectors.toList());

        System.out.println("=== High Capacity Bogies ===\n");

        filteredBogies.forEach(b -> b.display());

        System.out.println("\nProgram Continues...");
    }
}