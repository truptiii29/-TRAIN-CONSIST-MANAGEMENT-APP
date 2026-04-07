import java.util.*;

public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            try {
                if ("Rectangular".equalsIgnoreCase(shape) && "Petroleum".equalsIgnoreCase(cargo)) {
                    throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot go in Rectangular bogie");
                }
                this.cargo = cargo;
                System.out.println("Cargo '" + cargo + "' assigned to " + shape + " bogie successfully.");
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo assignment attempt completed for " + shape + " bogie.\n");
            }
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }
    }

    public static void main(String[] args) {
        List<GoodsBogie> goodsBogieList = new ArrayList<>();
        goodsBogieList.add(new GoodsBogie("Rectangular"));
        goodsBogieList.add(new GoodsBogie("Cylindrical"));
        goodsBogieList.add(new GoodsBogie("Rectangular"));

        goodsBogieList.get(0).assignCargo("Coal");         // safe
        goodsBogieList.get(1).assignCargo("Petroleum");    // safe
        goodsBogieList.get(2).assignCargo("Petroleum");    // unsafe
        System.out.println("Program continues safely after cargo assignments.");
    }
}