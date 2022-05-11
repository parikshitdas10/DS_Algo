import java.util.*;

public class maxPairProduct {

    static void getPair(int[] arr, ArrayList<Integer> max, int i) {
        int prod = 1;
        ArrayList<Integer> pairs = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (j == i) {
                continue;
            }
            for (int k = 0; k < arr.length; k++) {
                if (k == i || k == j) {
                    continue;
                }
                prod = arr[j] * arr[k];
                pairs.add(prod);

            }
        }

        int maxProd = pairs.get(0);
        for (int element : pairs) {
            if (element > maxProd) {
                maxProd = element;
            }
        }
        max.add(maxProd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> max = new ArrayList<>();
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int j = 0; j < N; j++) {
            arr[j] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            getPair(arr, max, i);
        }

        for (int element : max) {
            System.out.println(element);
        }

    }
}
