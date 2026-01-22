
import java.util.*;

public class SequentialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element you want to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Element " + key + " is found at position: " + (i + 1));
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " is not found.");
        }
    }

}
