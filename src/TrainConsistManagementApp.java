import java.util.*;

public class TrainConsistManagementApp {

    static class GoodsBogie {
        private String type;
        private String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }
    }

    public static void main(String[] args) {

        List<GoodsBogie> bogieList = new ArrayList<>();

        bogieList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogieList.add(new GoodsBogie("Rectangular", "Coal"));
        bogieList.add(new GoodsBogie("Rectangular", "Grain"));

        boolean isSafe = bogieList.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );

        System.out.println("=== Safety Compliance Check ===\n");

        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE for operation");
        }

        System.out.println("\nProgram Continues...");
    }
}