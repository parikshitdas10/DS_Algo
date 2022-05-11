import java.util.*;

public class usefulNumber {
    static int digitSum(int i) {
        int sum = 0;
        while (i != 0) {
            sum = sum + i % 10;
            i = i / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N = N % 1000000007; // 1 er por 8ta zero then 7.
        int K = sc.nextInt();
        int c = 0;
        int i = 1;
        int sum;
        int ans = 0;
        while (true) {

            sum = digitSum(i);
            if (sum > K) {
                i = i + (10 - (i % 10)) - 1;
            } else {
                ans = ans + i;
                c++;
            }
            if (c >= N) {
                break;
            }

            i++;
        }
        System.out.println(ans);

    }
}
