import java.util.*;

public class sqOfPrime {
    static boolean isPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int flag = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (!isPrime(i)) {
                continue;
            }
            for (int j = 1; j <= Math.sqrt(N); j++) {
                if (!isPrime(j)) {
                    continue;
                }
                if (i * i + j * j == N) {
                    System.out.println(i + j);
                    flag = 1;
                    return;
                }
            }
        }
        if (flag == 0) {
            System.out.println("-1");
        }
    }
}
