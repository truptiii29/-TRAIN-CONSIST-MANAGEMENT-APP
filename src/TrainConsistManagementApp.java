import java.util.*;

public class TrainConsistManagementApp {

    // Binary Search with validation (UC20)
    public static boolean binarySearchBogie(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input size
            System.out.print("Enter number of bogies: ");
            int n = Integer.parseInt(sc.nextLine());

            String[] bogieIds = new String[n];

            // Input bogie IDs
            if (n > 0) {
                System.out.println("Enter bogie IDs:");
                for (int i = 0; i < n; i++) {
                    bogieIds[i] = sc.nextLine();
                }
            }

            Arrays.sort(bogieIds);

            // Input search key
            System.out.print("Enter bogie ID to search: ");
            String key = sc.nextLine();

            // Perform search
            boolean found = binarySearchBogie(bogieIds, key);

            // Output
            if (found) {
                System.out.println("Bogie ID " + key + " found in the consist.");
            } else {
                System.out.println("Bogie ID " + key + " NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
