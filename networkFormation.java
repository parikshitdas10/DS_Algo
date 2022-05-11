import java.util.*;

public class networkFormation {
    static int solution(int n, int[] arr, int mc, int speed) {
        int c = 0;
        int num = 0;
        int s = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            s = s + arr[i];
            num++;
            if (s >= speed && num >= mc) {
                c++;
                s = 0;
                num = 0;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mc = sc.nextInt();
        int speed = sc.nextInt();
        int ans = solution(n, arr, mc, speed);
        System.out.println(ans);

    }
}
