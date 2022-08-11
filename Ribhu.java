import java.util.*;

class Ribhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // for scanning
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        // for printing
        System.out.println("Array elements are:");
        for (int j = 0; j < 5; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}