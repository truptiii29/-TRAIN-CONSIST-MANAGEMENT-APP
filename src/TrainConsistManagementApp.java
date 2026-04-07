import java.util.*;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearchBogie(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true; // Found
            } else if (result < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of bogies: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] bogieIds = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // 🔥 IMPORTANT: Sort before binary search
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

        sc.close();
    }
}