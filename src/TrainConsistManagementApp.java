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
        bogieList.add(new Bogie("Sleeper", 72));

        Map<String, List<Bogie>> groupedBogies =
                bogieList.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("=== Grouped Bogies by Type ===\n");

        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(b -> b.display());
            System.out.println();
        });

        System.out.println("Program Continues...");
    }
}