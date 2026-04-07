import java.util.*;

public class TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIds, String key) {
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // safer input
        String[] bogieIds = new String[n];

        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        String key = sc.nextLine();

        if (searchBogie(bogieIds, key)) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        sc.close();
    }
}