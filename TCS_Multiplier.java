import java.util.*;

// write a code to put all the multiplier of 10 at the end and others in the front
// and maintain the order
public class TCS_Multiplier {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 5, 40, 30, 7, 5, 9, 10 };
        int n = arr.length;
        ArrayList<Integer> queue = new ArrayList<>();
        int[] ans = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 == 0) {
                queue.add(arr[i]);
            } else {
                ans[k] = arr[i];
                k++;
            }
        }
        int j = 0;
        while (j < queue.size()) {
            ans[k] = queue.get(j);
            k++;
            j++;
        }
        for (int e : ans) {
            System.out.print(e + " ");
        }
    }
}
