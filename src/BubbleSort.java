import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want to enter : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.print("Your elements are : ");
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }
        // System.out.println();
        System.out.print("Select Sorting Technique (Ascending(Asc) / Descending(Des)) : ");
        String order = sc.next();

        switch (order) {
            case "Asc":
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.print("Elements in ascending order : ");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                break;

            case "Des":
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.print("Elements in Descending order : ");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                break;
            default:
                System.out.println("Error! Select the correct sorting technique.");
        }
        sc.close();
    }
}