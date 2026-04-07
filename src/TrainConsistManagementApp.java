public class TrainConsistManagementApp {

    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        boolean swapped;
        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap elements
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in inner loop, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] passengerCapacities = {72, 56, 24, 70, 60};

        System.out.println("Original capacities:");
        for (int cap : passengerCapacities) {
            System.out.print(cap + " ");
        }
        System.out.println();

        bubbleSort(passengerCapacities);

        System.out.println("Sorted capacities (ascending order):");
        for (int cap : passengerCapacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }
}