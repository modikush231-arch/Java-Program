import java.util.*;

public class binarysearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Shorted elements: ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int p : arr) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.err.print("Which No. do you want to search: ");
        int key = sc.nextInt();
        sc.nextLine();
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        for (int i = 0; i < n; i++) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                result = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (result != -1) {
            System.out.println("Element " + key + " is at position no. : " + (result + 1));
        } else {
            System.out.println("Error! " + key + " is not in the list.");
        }
    }
}
